package Interview.Threads;

public class OddPrinter extends Thread{
    Sequence value;

    public OddPrinter(Sequence sequence){
        value=sequence;
    }
    @Override
    public void run(){
        int count=0;
        while(count<5){
            value.printOdd();
            count++;
        }
    }
}
