package structuralPatterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    

    private HashMap<String,Circle> circleMap = new HashMap<>();


    public Circle makeCircle(String name){
        Circle circle = circleMap.get(name);
        if(circle == null){
            circle = new Circle(name);
            circleMap.put(name, circle);
        }
        return circle;
    }

    public void showCircleMap(){
        circleMap.values().stream().forEach(item -> System.out.println(item));
    }
    
    
}
