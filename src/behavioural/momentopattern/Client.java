package behavioural.momentopattern;

public class Client {
    public static void main(String[] args) {
        // 1) Origninator creation
        // 2) care Taker creation
        // 3) set internal state of originator
        // 4) save originator momento in care taker
        // 5) use internal state of the Originator
        // 6) if you want to redo by using careTaker

        TextEditorOriginator textEditor=new TextEditorOriginator();
        TextEditorCareTaker careTaker=new TextEditorCareTaker();
        textEditor.setContent("Hai Leo enna pandra");

        careTaker.saveState(textEditor);
        System.out.println("before redo : "+textEditor.getContent());

        textEditor.setContent("Hai Gopi enna pandra");
        careTaker.saveState(textEditor);
        System.out.println(textEditor.getContent());

        careTaker.redo(textEditor);
        System.out.println("after redo : "+textEditor.getContent());

    }
}
