package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ElementNode implements Node {

    private String name;

    private List<Node> children = new ArrayList<>();

    public ElementNode(String name){
        this.name = name;
    }

    @Override
    public Node add(Node node) {
        children.add(node);
        return this;
    }

    @Override
    public List<Node> children() {
        return children;
    }

    @Override
    public String toXml() {
        String start = "<" + name + ">\n";
        String end = "</" + name + ">\n";
        StringJoiner sj = new StringJoiner("", start, end);
        children.forEach(node -> {
            sj.add(node.toXml() + "\n");
        });
        return sj.toString();
    }
        
}
