public class LambdaReturnTest1 {
    interface Addition {
        int add(int a, int b);
    }
    interface Print{
        void print(int a);
    }
    public static void main(String args[]) {
        Addition ad=(a,b)->a+b;                //cannot use curly braces as return type is non-void;
        Print p = (a) -> {System.out.println("Printing a=" + a);};  //curly braces can be used only for Functional interface with return type as void;
        p.print(10);
        System.out.println("The addition of a and b is: " + ad.add(20, 50));
    }
}