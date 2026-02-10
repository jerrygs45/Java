
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@FunctionalInterface
interface add{
    void sum(int a, int b);
}

// for implemnting lambdas via streams
class StreamExample{
    public void processNumbers(List<Integer> numbers){
        // 1) Filter even numbers
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println("Evens: " + evens);

        // 2) Square numbers
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // 3) Print each number
        System.out.println("All numbers:");
        numbers.stream()
               .forEach(System.out::println);

        // 4) Sum of numbers
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

    }
}

public class LambdaFunction {
    public static void main(String[] args) {

        // Basic lambda syantax is - (parameters) -> { body }
        
        // Basic use of Lambda - 
        add Add = (a,b) -> System.out.println(a+b);

        add differentAdd =(a,b) -> {
            int res = a+b;
            System.out.println(res);
        };

        Add.sum(10,24);

        differentAdd.sum(40, 57);

        // Lambda using built in interfaces - 

        // 1) Predicate <T> - where T is boolean, used in conditions and filtering :
        Predicate <Integer> isEven = n -> n%2==0;
        System.out.println(isEven.test(112));

        // 2) Consumer <T> - Where T is void, used for actions, pinting, logging :
        Consumer <String> print = s -> System.out.println(s);
        print.accept("Hello bruv");

        // 3) Function <T,R> - Where T is R, used for transformations :
        Function <Integer, Integer> square = n -> n*n;
        System.out.println(square.apply(9));

        // 4) Supplier <T> - Where () -> T, used when no input, but output is required :
        Supplier <Double> random = () -> Math.random();
        System.out.println(random.get());

        // Note that - Bi-Variants (BiConsumer, BiFunction, BiPredicate) are just the 2 parameter versions of the originals.

        // Lambdas using streams -
        StreamExample obj = new  StreamExample();
        obj.processNumbers(List.of(1,2,3,4,5,6,7,8,9,10));

    }
}
