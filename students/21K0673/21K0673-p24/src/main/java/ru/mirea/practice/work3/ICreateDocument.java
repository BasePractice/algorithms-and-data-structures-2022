package ru.mirea.practice.work3;

public interface ICreateDocument {
    IDocument createNew(String string);

    IDocument createOpen(String string);
}
