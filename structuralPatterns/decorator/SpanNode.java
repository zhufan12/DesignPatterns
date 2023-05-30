package structuralPatterns.decorator;

public class SpanNode implements TextNode {

    private String spanText;

    @Override
    public void setText(String text) {
        this.spanText = text;
    }

    @Override
    public String getText() {
        return "<span>" + spanText + "</span>";
    }
    
}
