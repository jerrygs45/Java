public class Void_methods_6 {

    public static void Newline() {
        System.out.println();
    }

    public static void Threelines() {
        Newline();
        Newline();
        Newline();
    }
    
    public static void printTwice( String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void printTime(int hour, int min) {
        System.out.print(hour);
        System.out.print(":");
        System.out.print(min);
    }

    public static void main(String[] args) {
        
        //MATH METHODS-
        double root = Math.sqrt(17);
        System.out.println("The root is: " + root); 
        double angle = 1.5;
        double height = Math.sin(angle);
        System.out.println("The height is: "  + height);
        double radians = Math.toRadians(180);
        System.out.println(radians);
        double degrees = Math.toDegrees(Math.PI);
        System.out.println(degrees + "\n");

        //COMPOSITION REVISITED -
        double x = Math.cos(angle + Math.PI/2.0);
        System.out.println(x);
        double y = Math.exp(Math.log(10.0));
        System.out.println(y);
       
        //ADDING NEW METHODS -
        System.out.println("first line");
        Newline();
        System.out.println("second line");
        Threelines();                           // invoking method Newline in Threeline. 
        System.out.println("third line");

        // PARAMETER AND ARGUMENTS - 
        printTwice("Please, don't make me say this twice!!");
        String argument = "Never say Never!!";
        printTwice(argument);

        // MUTLIPLE PARAMETERS -
        int hours = 6;
        int min = 47;
        printTime(hours, min);
    }
    
}
