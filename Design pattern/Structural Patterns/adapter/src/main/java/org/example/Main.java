package org.example;

public class Main {
    public static void main(String[] args) {
        VietnameseTarget vietnameseTarget = new TranslatorAdapter(new JapaneseAdaptee());
        vietnameseTarget.send("Xin chào");
    }
}
