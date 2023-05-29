package creationalPatterns.abstractFactory;

public class AbstracFactoryDemo {
    public static void main(String[] args) {

        //product 1
        DrawAbstractFactory abstractFactory = new DrawAbstracFactory1();
        abstractFactory.getShape().draw();
        abstractFactory.getColor().fill();

        //product 1
        abstractFactory = new DrawAbstracFactory2();
        abstractFactory.getShape().draw();
        abstractFactory.getColor().fill();

        //product 3
        abstractFactory = new DrawAbstracFactory3();
        abstractFactory.getShape().draw();
        abstractFactory.getColor().fill();
    }
}
