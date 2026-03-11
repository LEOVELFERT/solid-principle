package behavioural.momentopattern;

import java.util.Stack;
//CareTaker
public class TextEditorCareTaker {
    Stack<TextEditorMomento> history = new Stack<>();

    public void saveState(TextEditorOriginator textEditor) {
        history.push(textEditor.save());
    }

    public void redo(TextEditorOriginator textEditor) {
        if(!history.isEmpty()){
            history.pop();
            textEditor.restore(history.peek());
        }
    }
}
