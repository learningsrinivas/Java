package creatingthreads;
class MyThread extends Thread{
    public void run() {
      //Job of Child  Thread.
        for(int i=0;i<10;i++) {
            // Executed by Child Thread
            System.out.println("Child Thread");
        }
    }
}
public class ExtendingThreadClass {

    public static void main(String[] args) {
        // Thread Instantiation
        MyThread t = new MyThread();
        t.start();
        /*Heart of MultiThreading
         * 1.Register this thread with Thread Schedular
         * 2.Invoke the run().
         * 3.Moves thread from new/born state to ready/runnable.
         * 4.creates the thread.
         */
        for(int i=0;i<10;i++) {
            System.out.println("Main Thread");
        }
    }

}
