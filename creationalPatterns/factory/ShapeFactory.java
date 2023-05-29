package creationalPatterns.factoryPattern;

public class ShapeFactory {
    

    public Shape getShape(ShapeType shapeType){
        if(shapeType == null){
            return null;
        }
        switch(shapeType){
            case CIRCLE:
            return new Circle();
            case RECTANGLE:
            return new Rectabgle();
            case SQUARE:
            return new Square();
            default:
                throw new RuntimeException("Shape not found !");
        }
    }   
}
