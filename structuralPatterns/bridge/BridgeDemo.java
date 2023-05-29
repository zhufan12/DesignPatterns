package structuralPatterns.bridge;


import structuralPatterns.bridge.color.Black;
import structuralPatterns.bridge.color.Red;
import structuralPatterns.bridge.shape.Circle;
import structuralPatterns.bridge.shape.Shape;
import structuralPatterns.bridge.shape.Square;

public class BridgeDemo {
    
    public static void main(String[] args) {
        
        Shape shape = new Square(new Red());
        shape.draw();


        shape = new Square(new Black());
        shape.draw();


        shape = new Circle(new Red());
        shape.draw();
    }
}
