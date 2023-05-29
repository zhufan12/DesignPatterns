package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.color.Black;
import creationalPatterns.abstractFactory.color.Color;
import creationalPatterns.abstractFactory.shape.Rectabgle;
import creationalPatterns.abstractFactory.shape.Shape;

public class DrawAbstracFactory2 extends DrawAbstractFactory {

    @Override
    Color getColor() {
        return new Black();
    }

    @Override
    Shape getShape() {
        return new Rectabgle();
    }
    
}
