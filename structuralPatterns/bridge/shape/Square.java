package structuralPatterns.bridge.shape;

import structuralPatterns.bridge.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw:Square Shape");
        color.fill();
    }
    
}

