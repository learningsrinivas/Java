package creatingthreads;
class MyThread12 extends Thread{
    static Thread mainThread;
    public void run() {
       try {
        mainThread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
       
       for(int i=0;i<10;i++) {
           System.out.println("Child Thread");
       }
    }
}
public class WaitingChildThreaduntilMainThread {

    public static void main(String[] args) throws InterruptedException {
        MyThread12.mainThread = Thread.currentThread();
       
       MyThread12 t = new MyThread12();
       
       
       
       t.start();
       
       for(int i=0;i<10;i++) {
           System.out.println("Main Thread");
           Thread.sleep(2000);
       }

    }

}
