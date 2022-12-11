package ru.mirea.practice.task3;

public class File {
    private Create create;

    public void neew(String string) {
        create.createnew(string);
    }

    public void open(String string) {
        create.createopen(string);
    }

    public void save() {
        System.out.println("Файлы сохранены");
    }

    public void exit() {
        System.out.println("Теперь вы можете открыть другой файл");
    }

}
