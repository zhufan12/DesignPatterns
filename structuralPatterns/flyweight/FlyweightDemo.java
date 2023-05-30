package structuralPatterns.flyweight;

import java.util.stream.Stream;

public class FlyweightDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        String[] circleNames = new String[]{"circle1","circle2","circle3","circle4","circle1","circle2"};
        
        Stream.of(circleNames).forEach(name -> {
            shapeFactory.makeCircle(name);
        });
        
        shapeFactory.showCircleMap();
        
    }
    
}
