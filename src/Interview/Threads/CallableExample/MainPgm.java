package Interview.Threads.CallableExample;

import java.util.concurrent.*;

public class MainPgm {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //futureTask();
        executorService();
    }
    public static void futureTask() throws InterruptedException, ExecutionException {
        Callable<String> ce = new CallableExample();
        FutureTask<String> ft = new FutureTask<>(ce);
        Thread t1 = new Thread(ft);
        t1.start();
        //Thread.sleep(3000);
        //if(ft.isDone()){
            System.out.println("Future Task using Thread Response "+ft.get());
       // }
    }
    public static void executorService() throws InterruptedException, ExecutionException {
        ExecutorService es =  Executors.newSingleThreadExecutor();
        Callable<String> ce = new CallableExample();
        Future<String> f= es.submit(ce);
        Future<String> f2= es.submit(ce);

        //Thread.sleep(3000);
        //if(f.isDone()){
            System.out.println("Executor service Response "+f.get());
        //}

        es.shutdown();//If you dont shutdown the executor Service the program will not end.
    }
}
