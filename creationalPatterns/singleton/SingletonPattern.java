package creationalPatterns.singleton;

public class  SingletonPattern {

    public static SingletonPattern INSTANCE = new SingletonPattern();

    private SingletonPattern(){}

    public static SingletonPattern  getInstace(){
        return INSTANCE;
    }

}


