package Interview.Clone;

public class Cloning {
    public static void main(String args[]){
        A a = new A(11,new B());
        try {
            A aCloned = (A) a.clone();
            aCloned.b.i=0;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        System.out.println("B instance i ="+a.b.i);//Deep-Cloning creates seperate instance for B also
    }
}

