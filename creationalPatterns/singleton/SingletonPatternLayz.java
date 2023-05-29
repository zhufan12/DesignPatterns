package creationalPatterns.singleton;

public class SingletonPatternLayz {

    private static class SingletonPatternLayzHelper{
        private static final SingletonPatternLayz INSTANCE = new SingletonPatternLayz();  
    }

    private  SingletonPatternLayz(){}


    public static SingletonPatternLayz getInstace(){
        return SingletonPatternLayzHelper.INSTANCE;
    }
    
    
}
