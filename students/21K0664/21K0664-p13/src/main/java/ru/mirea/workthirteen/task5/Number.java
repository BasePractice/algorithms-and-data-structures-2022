package ru.mirea.workthirteen.task5;

public class Number {
    private String code;
    private String three;
    private String secondthree;
    private String four;

    Number(String stroke) {
        int size = stroke.length();
        if (stroke.charAt(0) == '+') {
            if (size == 13) {
                this.code = stroke.substring(0, 3);
                this.three = stroke.substring(3, 6);
                this.secondthree = stroke.substring(6, 9);
                this.four = stroke.substring(9, 13);
            } else {
                this.code = stroke.substring(0, 2);
                this.three = stroke.substring(2, 5);
                this.secondthree = stroke.substring(5, 8);
                this.four = stroke.substring(8, 12);
            }

        } else if (stroke.charAt(0) == '8') {
            this.code = "+7";
            this.three = stroke.substring(1, 4);
            this.secondthree = stroke.substring(4, 7);
            this.four = stroke.substring(7, 11);
        }

    }

    public String getCode() {
        return code;
    }

    public String getFour() {
        return four;
    }

    public String getSecondthree() {
        return secondthree;
    }

    public String getThree() {
        return three;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public void setSecondthree(String secondthree) {
        this.secondthree = secondthree;
    }

    public void setThree(String three) {
        this.three = three;
    }

    @Override
    public String toString() {
        return "Number: " + code + " " + three + "–" + secondthree + "-" + four;
    }
}
