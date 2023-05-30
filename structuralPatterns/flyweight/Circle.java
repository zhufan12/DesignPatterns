package structuralPatterns.flyweight;


public class Circle implements Shape {

    private String name;
    
    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("draw:Circle Shape " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Circle [name=" + name + "]";
    }

}
