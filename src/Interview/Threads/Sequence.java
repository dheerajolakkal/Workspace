package Interview.Threads;

public class Sequence {
    int seq=0;
    boolean printOddflag =true;

    public synchronized void printOdd() {
        while(!printOddflag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printOddflag =false;
        seq++;
        System.out.print(seq);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }
    public synchronized void printEven() {
        while(printOddflag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printOddflag =true;
        seq++;
        System.out.print(seq);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

}
