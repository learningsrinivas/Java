package creatingthreads;
class MyRunnable implements Runnable{
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Child Thread");
        }
    }
}

public class ImplementsRunnable {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();
        
        Thread t = new Thread(r);
       
//      Thread t = new Thread(r,"Srinivas Thread");       
//     
//      t.setName("Bharu Thread");
//      
//      System.out.println(t.getName());
      t.start();
        
        
//        Thread t = new Thread(()->System.out.println("child thread"));
//        t.start();
//        
//        Thread t1 = new Thread(System.out::println);
//        t.start();
        //using lamda expression
    }

}
