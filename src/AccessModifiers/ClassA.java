package AccessModifiers;

public class ClassA {
    protected void  displayA(){
        System.out.println("ClassA");
    }
    protected void display(){
        System.out.print("Common display method of A");
    }
    protected int returnValue(){
        return 1;
    }
}
