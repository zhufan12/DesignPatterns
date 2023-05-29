package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.color.Color;
import creationalPatterns.abstractFactory.color.White;
import creationalPatterns.abstractFactory.shape.Shape;
import creationalPatterns.abstractFactory.shape.Square;


public class DrawAbstracFactory3 extends DrawAbstractFactory {

    @Override
    Color getColor() {
        return new White();
    }

    @Override
    Shape getShape() {
        return new Square();
    }
    
}
