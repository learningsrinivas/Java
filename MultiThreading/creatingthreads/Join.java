package creatingthreads;
class MyThread11 extends Thread{
    
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Seetha Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class Join {

    public static void main(String[] args) throws InterruptedException {
        MyThread11 t = new MyThread11();
        t.start();
        
        t.join();
        
        for(int i=0;i<10;i++) {
            System.out.println("Rama Thread");
        }
        
    }
}
