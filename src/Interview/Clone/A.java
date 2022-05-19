package Interview.Clone;

public class A implements Cloneable{
    public int j;
    public B b;

    public A(int j, B b){
        this.j = j;
        this.b= b;
    }

    public A clone() throws CloneNotSupportedException {
        //return (A) super.clone();
        A a = (A) super.clone();
        a.b=b.clone();
        return a;
    }
}
