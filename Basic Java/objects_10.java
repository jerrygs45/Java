

class object{
    void methodForObject(){
        System.out.println("This is a void method (retuns nothing) for methodForObject");
    }
}

public class objects_10 {
    
    public static void main(String[] args) {

        object obj /* <- This here is the instance variable. */ = new object() /* The RHS is completly the object. */;
        /* new allocates memory and creates a memory instance and returns a refernce to that memory. */
        /* object = container and instance variable = data inside container. */
        obj.methodForObject();
        
    }
}
