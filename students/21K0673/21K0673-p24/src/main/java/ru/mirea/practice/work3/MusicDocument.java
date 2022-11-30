package ru.mirea.practice.work3;

public class MusicDocument implements IDocument {
    private String string;

    MusicDocument(String string) {
        this.string = string;
    }

    @Override
    public String getString() {
        return string;
    }
}
