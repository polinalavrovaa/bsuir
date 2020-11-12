//класс «Автобус» производный от «Легкового автомобиля» содержит дополнительную информацию: количество мест

package com.company;

public class Bus extends Automobil {
    int number;

    public Bus(String str,String t,int p,int w,int m, int a, int b, int n) {
        super(str, t,  p, w,  m,  a, b);// вызов конструктора с параметрами из суперкласса
        number = n;
    }

    public Bus(String str,String t,int p,int w,int m, int a, int b) {
        super(str, t, p, w, m, a, b);// вызов конструктора с параметрами из суперкласса
        number = 20;
    }


    public int GetDataNumber() {
        return number;
    }


}
