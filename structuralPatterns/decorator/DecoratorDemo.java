package structuralPatterns.decorator;

public class DecoratorDemo {
        public static void main(String[] args) {
            TextNode textNode = new BoldDecorator(new SpanNode());
            textNode.setText("Hello World!");
            
            System.out.println(textNode.getText());
        }
}
