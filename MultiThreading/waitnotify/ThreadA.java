package waitnotify;

public class ThreadA{
    public static void  main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized(b) {
            System.out.println("Main Thread calling wait method");
            b.wait();
            System.out.println("Main Thread got notification");
            System.out.println(b.total);
        }
    }
}

class ThreadB extends Thread{
    int total = 0;
    public void run() {
        synchronized(this) {
            System.out.println("Child Thread starts execution");
            for(int i=1;i<=100;i++) {
                total =  total + i;
            }
            System.out.println("Child Thread giving notification");
            this.notify();
        }
    }
}