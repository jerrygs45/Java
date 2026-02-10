 /* 
    The O principle from SOLID principle stands for open close principle (OCP).In this 
    you add an new behaviour, without changing existing, tested code. Software entities 
    (classes, modules, functions) should be open for extension but closed for modification.

    What does it open for extension means? - You should be able to add new behaviour by 
    writing new code, not editing the old code.
    what does closed for modification means? - once a class is written, tested and stable 
    you should not edit its source code to add a new behaviour. 

*/

// Lets assume the following wrong application of OCP - 
// class DiscountCalculator {
//     double calculateDiscount(String userType) {
//         if (userType.equals("STUDENT")) {
//             return 0.20;
//         } else if (userType.equals("SENIOR")) {
//             return 0.30;
//         }
//           else if (userType.equals("EMPLOYEE")) {  //This was a new requirment meaning what if i added this.
//         }
//         return 0.0;
//     }
// }

/*  
    This is an example situation that may arise -

    What if someone accidentally changes SENIOR logic?
    What if a bug is introduced while adding EMPLOYEE?
    What if this method is already used in 10 places?
    That’s how existing logic gets broken — not intentionally, but accidentally during modification.
    This is called regression risk. 

*/

//  Below is the best method for this practice -

interface Discount{
    double apply();
}

class studentDiscount implements Discount{
    @Override
    public double apply() {
        return .057;
    }
}

class SeniorDiscount implements Discount{
    @Override
    public double apply() {
        return .023;
    }
}

class DiscountService{
    double calculate(Discount discount){ // This is here the heart of OCP 
        return discount.apply();
    }
}

public class Oprinciple {
   
    public static void main(String[] args) {
        DiscountService d = new DiscountService();

        Discount student = new studentDiscount();
        Discount senior = new SeniorDiscount();

        System.out.println(d.calculate(student));
        System.out.println(d.calculate(senior));
    }
}
