package AccessModifiers2;
import AccessModifiers.*;
public class ClassD extends ClassA {
    public static void main(String[] args){
        ClassB b = new ClassB();
        //b.displayA();
        ClassD d= new ClassD();
        d.displayA();
    }
}
