package mythread;

public class MyClass {

    public static void main(String[] args) throws InterruptedException {

        
    
    
        for (int i = 0; i < 1; i++) {
            MyThread myThread = new MyThread(false);
            myThread.start();
            Thread.sleep(3000);
            myThread.stopThread();
        }
    
    
       // System.out.println("active counts; " + Thread.activeCount());
        
        
        
        
    }


}
