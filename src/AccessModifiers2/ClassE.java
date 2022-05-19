package AccessModifiers2;

import AccessModifiers.ClassA;
import AccessModifiers.ClassB;

public class ClassE extends ClassD {
    public static void main(String[] args){
        ClassB b = new ClassB();
        //b.displayA();
        ClassD d= new ClassD();
        //d.displayA();
    }
}
