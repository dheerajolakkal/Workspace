package Interview.Threads.CallableExample;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {
    public String call(){
        return "callable str";
    }
}
