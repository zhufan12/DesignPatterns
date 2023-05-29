package creationalPatterns.builder;

public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildpart1();
    public abstract void buildpart2();
    public abstract void buildpart3();


    public Product getResult(){
        return product;
    }
    
}
