class MyThread extends Thread{
    public MyThread(String name){ // Made a constructor to give specific names to my thread during runtime. 
        super(name);
    }

    public void run(){ // this run method is a default method of inherited class Thread used to initiate threads.
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+ " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }

    }
    
}

public class MultiThreadding {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        t1.start();
        t2.start();

        
    }
}