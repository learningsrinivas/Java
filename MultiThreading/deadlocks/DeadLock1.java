package deadlocks;
class MyThread extends Thread {
    static Thread mainThread;
    public void run() {
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("child thread");
        }   
    }
}
public class DeadLock1 {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        MyThread.mainThread = Thread.currentThread();
        MyThread t = new MyThread();
        t.start();
        t.join();
        for(int i=0;i<10;i++) {
            System.out.println("main thread");
            Thread.sleep(2000);
        }
    }

}
