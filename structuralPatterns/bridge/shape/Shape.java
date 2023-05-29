package structuralPatterns.bridge.shape;

import structuralPatterns.bridge.color.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract void draw();
}
