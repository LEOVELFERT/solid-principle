package behavioural.momentopattern;

public class TextEditorOriginator {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public TextEditorMomento save() {
        TextEditorMomento textEditorMomento = new TextEditorMomento();
        textEditorMomento.setContent(this.content);
        return textEditorMomento;
    }

    public void restore(TextEditorMomento pop) {
        this.setContent(pop.getContent());
    }
}
