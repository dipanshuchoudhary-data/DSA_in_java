class sleepTask implements  Runnable{
    public void run(){
        for (int i=1;i<=100;i++) {
            System.out.println("Dippu");
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                System.out.println("DIpanshu");
            }
        }
    }
}

class JoinTask implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" -Count : "+i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
}

class YieldTask implements Runnable  {
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"- count : " + i);
            Thread.yield();
        }
    }
}

public class Threading_methods {

    public static void main(String[] args) {
        // Thread t1 = new Thread(new sleepTask(),"worker-1");
        // Thread t2 = new Thread(new sleepTask(),"Worker-2");

        // t1.start();
        // t2.start();


        // Thread t_j_1 = new Thread(new JoinTask(),"worker-11");
        // Thread t_j_2 = new Thread(new JoinTask(),"worker-22");

        // t_j_1.start();
        // try {
        //     t_j_1.join();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // t_j_2.start();

        Thread ty1 = new Thread(new YieldTask(),"worker-111");
        Thread ty2 = new Thread(new YieldTask(),"Worker-222");

        ty1.start();
        ty2.start();
    }
}
