/*
    The L principle from SOLID principle stands for Liskov's subsitution principle (LSP). In this
    the objects of superclass should be replacable with objects of its subclasses without breaking 
    the correcteness of the program. 

    LSP is about using a parent’s reference to call a method, and ensuring the child behaves correctly
    when it overrides that method.

*/

class Vehicle{
    void StartEngine(){
        System.out.println("Engine Started.");
    }
}

class car extends Vehicle{

    @Override
    void StartEngine(){
        System.out.println("Car engine has started.");
    }

    void openTrunk(){
        System.out.println("Opened car's Trunk or boot.");
    }
}

public class Lprinciple {
    public static void main(String[] args) { 

        Vehicle v = new car(); // used refernce vehicle (parent) to call the car's (child) constructor 
        v.StartEngine();

    }
}
