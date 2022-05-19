package Interview;

public class SingletonObject {
    static SingletonObject singletonObject;
    private SingletonObject(){

    }
    public static SingletonObject getInstance(){
        if (singletonObject== null)
            singletonObject=new SingletonObject();
        return singletonObject;
    }
}
