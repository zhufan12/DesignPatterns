package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.color.Color;
import creationalPatterns.abstractFactory.shape.Shape;

public abstract class DrawAbstractFactory {

    abstract Color getColor();

    abstract Shape getShape();
}
