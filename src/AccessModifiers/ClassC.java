package AccessModifiers;

public class ClassC {
    protected  void  displayC(){
        //displayA();
        System.out.println("ClassC");
    }
    protected void display(){
        System.out.print("Common display method of C");
    }
    public static void main(String[] args){
        ClassA a= new ClassA();
        a.display();
    }
}
