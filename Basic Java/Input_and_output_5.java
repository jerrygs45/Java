import java.util.Scanner;
public class Input_and_output_5 {
    
    public static void main(String[] args) {

        // THE SYSTEM CLASS -
        System.out.println(System.out);

        // THE SCANNER CLASS - 
        // String line;
        // Scanner in = new Scanner(System.in);
        // System.out.println("Type something: ");
        // line = in.nextLine();
        // System.out.println("you said: " + line);
        // System.out.println("Type something else: ");
        // line = in.nextLine();
        // System.out.println("You also said: " + line);

        //MISCELLENOUS -
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter inches:" );
        inch = in.nextInt();
        cm = inch * 2.54; // 2.54 is  a magic number. Good practice is to assign a variable to this value such as  <-----
                          // double converter = 2.54 or even better practice is final double converter = 2.54;          |
        System.out.println("The respective conversion in cm is:" + cm);                                         //      |
                                                                                                                //      |
    // This code works correctly but has a minor problem. For benefit of other its better to assign this value to a variable
    // with a meaningful name. 

        // FORMATTING OUTPUTS- 
        System.out.printf("Four thirds = %.3f \n", 4.0/3.0); 
        System.out.printf("%d in = %f cm \n", inch, cm); 
        System.out.printf("Padded with zeros: %08d ", inch);
        
        // TYPE CASTING - 
        double pi = 3.14159;
        int x = (int) pi;
        System.out.println("\n" + x);
        double k = (int) pi * 20; 
        System.out.println(k);

        // THE SCANNER BUG 
        String name;
        int age;
        System.out.print("Enter your age:");
        age = in.nextInt();
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.println("Your name is : " + name + ", and your age is : " + age);
        
    }
}
