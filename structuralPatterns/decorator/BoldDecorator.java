package structuralPatterns.decorator;

public class BoldDecorator extends NodeDecorator {

    protected BoldDecorator(TextNode textNode) {
        super(textNode);
    }

    @Override
    public String getText() {
        return "<b>" + textNode.getText() + "</b>";
    }
    
}
