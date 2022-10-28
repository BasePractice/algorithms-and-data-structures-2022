package ru.mirea.workseven.task4;

class MathFunc implements MathCalculable {
    private int imaginary;
    private int valid;

    public MathFunc(int imaginary, int valid) {
        this.imaginary = imaginary;
        this.valid = valid;
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getValid() {
        return valid;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public double exponentiation(int n) {
        return n;
    }

    public double module() {
        return Math.pow(this.valid ^ 2 + this.imaginary ^ 2,0.5);
    }

    public String toString() {
        return imaginary + " " + valid + 'i';
    }

    public double lengthCircle(int r) {
        return Math.PI * r * 2;
    }

    public double squareCircle(int r) {
        return Math.PI * r * r;
    }
}
