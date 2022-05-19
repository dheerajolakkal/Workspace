package LambdaTest1;

public class LambdaTest2 {
     static public int a;
    public static void main(String[] args){
       LambdaTest lambdaTest =  new LambdaTest((x)->{
            if (x<5)
                a=1;
            else
                a=100;
        });
        //lambdaTest.lamdba();
        lambdaTest.test.consume(5);
        System.out.println(a);


    }
}
