package structural.decorator;

public class SimpleTextEditor extends TextEditor{
    private String text;
    public SimpleTextEditor(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
