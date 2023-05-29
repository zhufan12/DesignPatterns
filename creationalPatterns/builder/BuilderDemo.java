package creationalPatterns.builder;

public class BuilderDemo {
 
    
    public static void main(String[] args) {
        Director director = new Director(new BuilderProduct1());

        director.make();
        System.out.println(director.getResulit());


        director.changeBuilder(new BuilderProduct2());
        director.make();
        System.out.println(director.getResulit());
    }
}
