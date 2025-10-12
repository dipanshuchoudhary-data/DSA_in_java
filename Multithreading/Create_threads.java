
// public class Create_thread extends Thread {

    // public void run(){
    //     for (int i=0;i<=1000;i++){
    //         System.out.println(Thread.currentThread().getName()+ "- Count : " + i);
    //     }
    // }
    // public static void main(String[] args) {
    //     // Create_thread cr1 = new Create_thread();
    //     // Create_thread cr2 = new Create_thread();

    //     // cr1.setName("Thread-A");
    //     // cr2.setName("Thread-B");

    //     // cr1.start();
    //     // cr2.start();

    //     // System.out.println("Main thread finished");

    // }
 
// }

class Worker implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "- Count : " + i);
        }
    }
}

public class Create_threads {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Worker(), "Worker-1");
        Thread t2 = new Thread(new Worker(), "Worker-2");

        t1.start();
        t2.start();

        System.out.println("Main thread finished");
    }
}

    

