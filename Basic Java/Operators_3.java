public class Operators_3 {
    
    public static void main(String[] args) {

        // ARITMETIC OPERATORS 
        int hour=11;
        int min= 59;
        System.out.println("Number of minutes since midnights: "  + ( hour * 60 + min));
        System.out.println("fraction of hour that has passed is: " + (min / 60)); //java performs integer division.
        System.out.println("Percentage of hour that has passed :" + (min*100 / 60));

        // FLOATING POINT NUMBERS 
        double minute = 59.0;
        System.out.println("Fraction of hour that has passed is: " + (minute/60)); //java performs floating point division.
        
        // ROUNDING ERRORS-
        System.out.println(0.1*10);
        System.out.println(0.1+0.1+.01+0.1+0.1+0.1+0.1+0.1+0.1+0.1);//rounding error

        // OPERATORS FOR STRINGS
        System.out.println("Hello " + "World!");
        String name = "Ratna Srijan";
        System.out.println("My name is: " + name);
        System.out.println(1 + 2 + "Hello");
        System.out.println("Hello" + 1 + 2);
        
    }
}
