package Interview.Clone;

public class B implements Cloneable{
    public int i=10;

    public B clone() throws CloneNotSupportedException {
        return (B)super.clone();
    }
}
