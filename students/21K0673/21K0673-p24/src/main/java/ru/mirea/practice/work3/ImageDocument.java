package ru.mirea.practice.work3;

public class ImageDocument implements IDocument {
    private String string;

    ImageDocument(String string) {
        this.string = string;
    }

    @Override
    public String getString() {
        return string;
    }
}
