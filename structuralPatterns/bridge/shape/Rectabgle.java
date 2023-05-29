package structuralPatterns.bridge.shape;

import structuralPatterns.bridge.color.Color;

public class Rectabgle extends Shape{

    public Rectabgle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw:Rectabgle Shape");
        color.fill();
    }
    
}
