public class HelloWorld2 {
    public static void main(String args[]){
        //HelloWorld hw= new HelloWorld();
        System.out.println(display());
    }
    static String display(){
        try{
            int i = 10/0;
            return "Try";
        } catch (Exception e){
            System.out.println("asdasdas");
            //int j = 9/0;
            return "catch";
        }
        finally{
            return "finally";
            //System.out.println("Print finally ");
        }
        //return "completed";
    }
}
