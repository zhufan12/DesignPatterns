package structuralPatterns.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectabgle();
        shapeMaker.drawSquare();
    }
}
