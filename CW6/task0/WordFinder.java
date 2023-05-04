package org.example.CW6.task0;

public class WordFinder {
    public Word wordFinder(Text text, Word word){
        String[] textArr = text.getText().split(" ");
        for(String el : textArr){
            if(el.equals(word)) return word;
        }
        return null;
    }
}
