package ru.mirea.practice.work3;

public class File {
    private Create create;

    public void newe(String string) {
        create.createNew(string);
    }

    public void open(String string) {
        create.createOpen(string);
    }

    public void save() {
        System.out.println("Файлы сохранены");
    }

    public void exit() {
        System.out.println("Теперь вы можете открыть другой файл");
    }

}
