package ru.mirea.practice.s21k0647.punkt123;

import java.io.Serializable;

public class MyClass<T extends Comparable, V extends Animal & Serializable, K> {
    T var1;
    V var2;
    K var3;

    public MyClass(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1() {
        return var1;
    }

    public V getVar2() {
        return var2;
    }

    public K getVar3() {
        return var3;
    }


    public String getVar1Name() {
        return  var1.getClass().getSimpleName();
    }

    public String getVar2Name() {
        return var2.getClass().getSimpleName();
    }

    public String getVar3Name() {
        return var3.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return var1 + " (" + getVar1Name() + ")" + '\n' + var2 + " (" + getVar2Name()
                + ")" + '\n' + var3 + " (" + getVar3Name() + ")";
    }
}
