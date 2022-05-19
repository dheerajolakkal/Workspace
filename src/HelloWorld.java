
public class HelloWorld {
    private HelloWorld(){
    }

    public static void main(String args[]){
        String a= "a";
        String b= "b";
        String cc=a+b;

        HelloWorld hw= new HelloWorld();
        System.out.println(cc.intern()=="ab");
    }
}
