package ru.mirea.practice.solutiontask7;

public final class BookTest {
    private BookTest() {}

    public static void main(String[] args) {

        Book testbookf = new Book("Карл Маркс", "Капитал",
                "главный труд немецкого философа и экономиста Карла Маркса по политической экономии,"
                        + " содержащий критический анализ капитализма.",1867);
        Book testbooks = new Book("Владимир Ленин", "Что делать?",
                "Название книги повторяет название романа «Что делать?» Николая Чернышевского,"
                        + " по словам Ленина, преобразовавшего в революционеры сотни человек и изменившего его самого."
                        + " Ленин делал акцент на определении марксизма как «живого руководства к действию»",1902);
        Book testbookt = new Book("Фридрих Энгельс", "Происхождение семьи,"
                + " частной собственности и государства", " произведение немецкого мыслителя Фридриха Энгельса,"
                + " посвящённое основным проблемам первоначальной истории, эволюции семейно-брачных отношений,"
                + " анализа процессов разложения родового общества, становления частной собственности,"
                + " общественных классов и государства.", 1884);

        Book[] temp = {testbookf, testbooks, testbookt};

        BookShelf newbooks = new BookShelf(temp, 3);

        System.out.println(newbooks.getOlderBook());
        System.out.println(newbooks.getYearlyBook());

        System.out.println(newbooks);

        newbooks.sortBooks();

        System.out.println(newbooks);
    }
}
