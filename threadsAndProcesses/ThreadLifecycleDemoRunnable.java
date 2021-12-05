package threadsAndProcesses;

class ChefOlivia implements Runnable {
    public void run() {
        System.out.println("Olivia started & waiting for sausage to thaw...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Olivia is done cutting sausage.");
    }
}



public class ThreadLifecycleDemoRunnable {

    /*
        Thread VS runnable 
        threads- a class which extends thread cant extend any other class as multiple inheritance is not allowed but using\
         Runnable interface we can implement other interfaces and also extend a class 

         When we instantiate a class which extends thread , each instance will be each separate object BUT 
         when using runnable , we can instantiate runnable object once and create multiple threads from it.All of those threads will 
         share same object which will reduce memory usage



    */





    public static void main(String args[]) throws InterruptedException {

        System.out.println("***************************************");

        System.out.println("Barron started & requesting Olivia's help.");
        Thread olivia = new Thread(new ChefOlivia());


        System.out.println("        Olivia state: " + olivia.getState());

        System.out.println("Barron tells Olivia to start.");
        olivia.start();
        System.out.println("        Olivia state: " + olivia.getState());

        System.out.println("Barron continues cooking soup.");
        Thread.sleep(500);
        System.out.println("        Olivia state: " + olivia.getState());

        System.out.println("Barron patiently waits for Olivia to finish and join...");
        olivia.join();
        System.out.println("        Olivia state: " + olivia.getState());

        System.out.println("Barron and Olivia are both done!");

        System.out.println("***************************************");

    }
}



