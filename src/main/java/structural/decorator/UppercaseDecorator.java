package structural.decorator;

public class UppercaseDecorator extends TextEditor {

    private TextEditor textEditor;
    public UppercaseDecorator(TextEditor textEditor) {
       this.textEditor = textEditor;
    }

    @Override
    public String getText() {
        return textEditor.getText().toUpperCase();
    }
}
