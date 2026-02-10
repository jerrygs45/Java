/* Now what are the SOLID principles in java ? The SOLID principles refers to the 5 object oriented 
    design principle that help you write clean, maintable, scalable and testable code. They are not 
    properties itself but rather design principles used while writing java classes. */

    // The below class holds 3 varying responsibilty that has no relation with the class name.
//     class User {
//     void createUser() {}
//     void saveToDatabase() {}
//     void sendEmail() {}
// }

// Following is the correct user class -
class User {
    void createUser() {
        System.out.println("New User Created.");
    }
    void updateUser() {
        System.out.println("User Updated.");
    }
    void deleteUser() {
        System.out.println("User Deleted.");
    }
}


public class Sprinciple {
    /*The S principle from SOLID principle stands for Single Responsibility Principle (SRP). In this
    a class should have only one reason to change or rather a class must hold only one responsibility*/
    public static void main(String[] args) {
        User obj = new User();
        obj.createUser();
        obj.updateUser();
        obj.deleteUser();     
        }
}

/* Note that when we say a class a certain responsibilty it don't mean that a class can have only one method.
   It means that the no. of methods that the class has must work in order to fulfil that particular responibilty*/
