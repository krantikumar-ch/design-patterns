package structural.decorator;

public class LowercaseDecorator extends TextEditor{
    private TextEditor textEditor;

    public LowercaseDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public String getText() {
        return textEditor.getText().toLowerCase();
    }
}
