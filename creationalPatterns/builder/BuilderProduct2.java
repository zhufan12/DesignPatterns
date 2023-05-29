package creationalPatterns.builder;

public class BuilderProduct2 extends Builder {

    @Override
    public void buildpart1() {
       product.setPart1("Product1 part 1 is B");
    }

    @Override
    public void buildpart2() {
        product.setPart2("Product1 part 2 is B");
    }

    @Override
    public void buildpart3() {
        product.setPart3("Product1 part 3 is B");
    }
    
}