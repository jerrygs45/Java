/*
    The I principle from SOLID principle stands for Interface segregation principle (ISP). In this
    clients should not be forced to be dependent on the interfaces they do not use.

    In simpler terms An interface should only contain the methods that the implementing class
    actually needs. No class should be forced to implement methods it doesn’t use.
    
*/

// Below is a code that violates the ISP  

// interface Worker {
//     void work();
//     void eat();
// }
// class HumanWorker implements Worker {
//     public void work() {
//         System.out.println("Human working");
//     }
//     public void eat() {
//         System.out.println("Human eating");
//     }
// }
// class RobotWorker implements Worker {
//     public void work() {
//         System.out.println("Robot working");
//     }
//     public void eat() {
//         
//         throw new UnsupportedOperationException("Robot doesn't eat");
//     }
// }

// Below is the example of its implementation - 

interface Workable { 
    void work(); 
}
interface Eatable { 
    void eat();
 }

class Human implements Workable, Eatable { 
    @Override
    public void work() {
        System.out.println("The Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("The human is eating.");
    }

 }

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("The robot is working.");
    }
 }



public class Iprinciple {
    public static void main(String[] args) {
        Workable w1 = new Human();
        w1.work();

        Workable w2 = new Robot();
        w2.work();

        Eatable e = new Human();
        e.eat();
    }
}
