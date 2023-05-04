package org.example.CW6.task0;

public class TextAppender {
    public Text appendText(Text currentText, Text newText){
        return new Text(currentText.getText() + newText.getText());
    }
}
