package ru.mirea.practice;

class Converter {

    private double value;
    private int valute;

    public static final String[] S = {"$", "€", "₽", "¥", "£"};
    //Первая 1 валюта доллар, вторая 2 евро, третья 3 рубли,
    //четвёртая 4 юани, пятая 5 фунты
    private static final double[] k = {1, 1.1, 1 / 65.0, 1 / 8.0, 1.2};
    //Коэфициент отношения каждой валюты к доллару сооветственно.
    //Данные выдуманные.

    public Converter(double v, int valute) {
        this.value = v;
        this.valute = valute;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getValute() {
        return valute;
    }

    public void setValute(int valute) {
        this.valute = valute;
    }

    public Converter toValute(int t) {
        return new Converter(this.value * (k[this.valute - 1] / k[t - 1]), t - 1);
    }
    //С помощью входного значения t определяется, в какую валюту произойдёт конвертация
    //Номера валют указаны возле массива S.

    @Override
    public String toString() {
        return value + " " + S[valute - 1];
    }


}
