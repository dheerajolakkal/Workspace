package Interview.Threads;

public class SequencePrinter {
    public static void main(String[] args){
        Sequence seq= new Sequence();
        OddPrinter op = new OddPrinter(seq);
        EvenPrinter ep = new EvenPrinter(seq);
        op.start();
        ep.start();
    }
}
