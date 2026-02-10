import java.util.Scanner;
public class _07_conditions_and_logic {

    public static void printLogarithm(double y) {
        if(y <= 0.0){
            System.out.println("Error: input must be positive");
            return;
        }
        double result = Math.log(y);
        System.out.printf("The log of %f is %f", y, result);   
    }

    public static void scanDouble (Scanner in) {
        System.out.println("\nEnter a number: ");

        if(!in.hasNextDouble()){                                // This if is used to check the input. 
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }

        double x = in.nextDouble();
        printLogarithm(x);    
    }

    public static void countdown(int n) {
        if(n==0){
            System.out.println("Blastoff!");
        }
        else{
            System.out.println(n);
            countdown(n-1);
        }
    }
    
    public static void main(String[] args) {
        // RELATIONAL OPERATORS -
        String fruit1 = "Apple";
        String fruit2 = "Orange";
        System.out.println(fruit1.equals(fruit2));

        // LOGICAL OPERATORS -
        // Practice any questions ask chat gpt 

        // CONDITIONAL STATEMENTS - 
        int x = 3;
        if(x>0){
            System.out.println("x is positive");
        }
        if(x%2==0){
            System.out.println("x is even");
        }
        else{
            System.out.println("x is odd");
        }

        // CHAINING AND NESTING -
        // Below is the example of chaining -
        if(x>0){
            System.out.println("x is positive");   
        }
        else if (x<0){
            System.out.println("x is negative");
        }
        else{
            System.out.println("x is zero");
        }

        // Below is the example of nesting -
        if(x==0){
            System.out.println("x is zero");
        }
        else{
            if(x>0){
                System.out.println("x is positive");
            }
            else{
                System.out.println("x is negative");
            }
        }

        // FLAG VARIABLES -
        boolean flag;
        flag = true;
        boolean testResult = false;
        boolean oddFlag = (x%2!=0);     // ** 
        boolean positiveFlag = (x>0);   // **

        // THE RETURN STATEMENT - 
        printLogarithm(10);

        // VALIDATING INPUT -
        Scanner in = new Scanner(System.in);
        scanDouble(in);

        // RECURSIVE METHODS -
        countdown(20);          // Study stack diagrams for recursion to unnderstand how things happen in the backend or dry run it.
        
    }
}
