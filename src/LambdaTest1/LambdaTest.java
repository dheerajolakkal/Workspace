package LambdaTest1;

public class LambdaTest {
    private int i =0;
    public TestFunctionalInterface test;
   public LambdaTest(int i){
        this.i=i;
    }
    public void lamdba(){
       test = (x)->{i=10;};
        //System.out.println(i);
    }

    public LambdaTest(TestFunctionalInterface test){
       this.test=test;
    }
    public static void main(String[] args){
        LambdaTest lambdaTest =  new LambdaTest(0);
        lambdaTest.lamdba();
    }
    public int getI(){
       return i;
    }
}
