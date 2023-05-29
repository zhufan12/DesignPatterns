package creationalPatterns.factoryPattern;

public class FactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();

        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();
        
    }
    
}
