package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.color.Color;
import creationalPatterns.abstractFactory.color.Red;
import creationalPatterns.abstractFactory.shape.Circle;
import creationalPatterns.abstractFactory.shape.Shape;

public class DrawAbstracFactory1 extends DrawAbstractFactory {

    @Override
    Color getColor() {
        return new Red();
    }

    @Override
    Shape getShape() {
        return new Circle();
    }
    
}
