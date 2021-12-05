package threadsAndProcesses;

public class App {
    
    public static void main(String[] args) {

        System.out.println("Hello");

 
        /*

        process: has its own code, state and data 
        inndependent instance of running program and its own address space in memory 

        Thread - basic unit which OS manages;independent path of execution
             OS schedules threads for execution

        threads belonging to the same process share the process's address space which give them access to same resources in memory
        like process's data and executable code

        Each process has its own address space.
        To communicate and share data between processes is more complicated as compared to communication between threads
        : we use 1.IPC 2. shared memory 3. RPC

        threads are lightweight than processes and switching from one to another is easier


        when we run a java program it executes in its own instance of JVM and OS treats that JVM instance as a process 
        SO if we execute multiple java program they will get executed in their own instance of JVm and will be 
        separate process with their own memory space

        */


        /*
        
        Concurrency VS parallel execution

        Concurrency : ability of progeram to be broken into 
        parts that can run independently of each other , irrespective of the order

        Concurrency - not inherently parallel - without parallel hardware ; dealing with multiple things at once but doing it always
        Parallelism: simultaneous execution of code;
        Parallel execution - possible only with multi core hardware 

        */

        /*
        
        Scheduler - a OS function that assigns processes or threads available CPU to run
        */



        
        /*
        
            phases of life cycle of threads 
            1. new -initialized  but not running- no CPU resources used
            2. runnable - runnning and executing task - CPU used
            3. Blocked (wait / resume) - no CPU resources used
            4. terminated state - when either aborted or finished

        */

                
        /*
        
           states of threads in java
            1. new -initialized  but not running- no CPU resources used
            2. runnable - runnning and executing task - CPU used
            3. Blocked (wait / resume) - no CPU resources used
            4. terminated state - when either aborted or finished
            5. waiting - wait indefinitely
            6. timed_waiting - wait upto a specfic time

        */

        /*
            threads do not maintain reference to their parent head
        */




        /*

            Daemon  threads - does not prevent process from terminating; 
            refer to threads running in backgroud such as threads that do garbage collection;
            by default created threads are non daemaon

            daemon threads to handle continuous background tasks - as       
            The daemon thread will not prevent the program from terminating when the main thread is finished

            A daemon thread will be abruptly terminated when the main thread finishes. 
            If that occurs during a write operation the file could be corrupted.
        */



    
    }
}
