//«Автомобиль», который содержит следующую информацию: марка автомобиля, тип двигателя



package com.company;

public class Automobil extends Cars { 
    private int a, b;

    public Automobil(String str,String t,int p,int w,int m, int a, int b) {
        super(str, t, p, w, m); //вызов конструктора с параметрами из суперкласса
        this.a = a;
        this.b = b;
    }

    public Automobil(String str,String t,int p,int w,int m) {
        super(str, t, p, w, m);// вызов конструктора с параметрами из суперкласса
        a = 20;
        b = 7;
    }


    public int GetDataa() {
        return a;
    }

    public int GetDatab() {
        return b;
    }

}
