package structural.decorator;



public class CapitalizeDecorator extends TextEditor{

    private TextEditor textEditor;

    public CapitalizeDecorator(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    private String camelCase(String text){
        StringBuffer sb = new StringBuffer();
        for(String str: text.split(" ")){
            Character firstChar = Character.toUpperCase(str.charAt(0));
            String remain = str.substring(1).toLowerCase();
            sb.append(firstChar+remain).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    @Override
    public String getText() {
        return camelCase(textEditor.getText());
    }
}
