package creationalPatterns.builder;

public class Director {
    
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }


    public void changeBuilder(Builder builder){
        this.builder = builder;
    }

    public void make(){
        builder.buildpart2();
        builder.buildpart1();
        builder.buildpart3();  
    } 

    public Product getResulit(){
        return builder.getResult();
    }
}
