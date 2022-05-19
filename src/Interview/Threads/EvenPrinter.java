package Interview.Threads;

import Interview.Threads.Sequence;

public class EvenPrinter extends Thread{
    Sequence value;

    public EvenPrinter(Sequence sequence){
        value=sequence;
    }
    @Override
    public void run(){
        int count=0;
        while(count<5){
            value.printEven();
            count++;
        }
    }

}
