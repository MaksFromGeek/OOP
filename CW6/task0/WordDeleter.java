package org.example.CW6.task0;

public class WordDeleter {
    public Text deleteWordInText(Text text, Word wordToDelete){
        String inputText = text.getText();
        if (inputText.contains(wordToDelete.getWord())) {
            inputText = inputText.replace(wordToDelete.getWord(), "");
        } return new Text(inputText);
    }
}
