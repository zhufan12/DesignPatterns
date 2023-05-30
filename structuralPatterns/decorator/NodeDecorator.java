package structuralPatterns.decorator;

public abstract class NodeDecorator implements TextNode {

    protected final TextNode textNode;

    protected NodeDecorator(TextNode textNode){
        this.textNode = textNode;
    }

    public void setText(String text){
        this.textNode.setText(text);
    }

    
}
