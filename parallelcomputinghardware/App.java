package parallelcomputinghardware;

public class App {
    
    public static void main(String[] args) {

        System.out.println("Hello");

        //Sequential computing- can execute only one instruction at a time
        //time it takes based on speed of processor and how fast it can execute these instruction


        //Parallel computing- break large task into independent parts that can be executed simultaneouslybu diff processors
        

        //having more processor not always make execution faster as more processor adds to complexity and extra efforts are4 required to communicate with each other processors to coordinate actions. there could be a chance that one processor has to wait for the other processor to complete an instruction to proceed

        //Parallel computing - increase throughput
        //executes more task in given amount of time



        //Parallel computing - Architecture 
        //Flynn's Taxonomy - based on data streams and instruction streams
        //1. SISD - has simgle processor- can execute only one instruction at a time and act on only one data at a time
        //2.SIMD - useful when same handful of operation needs to be performed in massive data set- like image processing. All of its processors process same instruction at any given time but each operate on different data element and will execute those intruction in sync with each other
        //3.MISD- Each processing unit execute their own separate set of instruction but operate on same single streaming of data. Very uncommon
        //4.MIMD- multicore PC, supercomputer


        







    }
}
