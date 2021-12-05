package threadsAndProcesses;

class ChefOlivia extends Thread {
    public void run() {
       while(true){
        System.out.println("Olivia cleaning");
            try{ 
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       }
    }
}



public class ThreadLifecycleDemoRunnableDaemon {

    /*
        new threads will inherit daemon status from their parent
        when JVM halts any remaining daemon threads are abondoned
    */

    public static void main(String args[]) throws InterruptedException {

        System.out.println("***************************************");

        Thread olivia = new ChefOlivia();
        olivia.setDaemon(true);//when main thread is done executing , olivia thread goes on executing which manually
        //has to be stopped. setting thread as daemon will stop the thread after main thread stops executing
        olivia.start();

        System.out.println("Barron is cooking");
        Thread.sleep(600);
        System.out.println("Barron is cooking");
        Thread.sleep(600);
        System.out.println("Barron is cooking");
        Thread.sleep(600);
        System.out.println("Barron is cooking");
        Thread.sleep(600);
        System.out.println("Barron is cooking");
        Thread.sleep(600);
        System.out.println("Barron is cooking");
        Thread.sleep(600);
        System.out.println("***************************************");

    }
}



