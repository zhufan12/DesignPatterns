package structuralPatterns.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Node root = new ElementNode("html");
        root.add(new ElementNode("body")
        .add(new ElementNode("title")
        .add(new TextNode("Title"))));

        System.out.println(root.toXml());
    }
}
