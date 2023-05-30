package structuralPatterns.facade;

public class ShapeMaker {
    
    private Square square;

    private Rectabgle rectabgle;

    private Circle circle;
    
    public ShapeMaker(){
        square = new Square();
        rectabgle = new Rectabgle();
        circle = new Circle();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectabgle(){
        rectabgle.draw();
    }

    public void drawCircle(){
        circle.draw();
    }
}

