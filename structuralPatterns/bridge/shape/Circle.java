package structuralPatterns.bridge.shape;

import structuralPatterns.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw:Circle Shape");
        color.fill();
    }
    
}
