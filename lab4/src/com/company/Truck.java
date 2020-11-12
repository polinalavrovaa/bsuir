package com.company;

public class Truck implements Object, Cars {// класс, реализующий 2 интерфейса
    private double a, b;

    public Truck(int a, int b) {
        this.a = a;
        this.b = b;
    }// конструктор класса

    public double GetA() {
        return a;
    }// гет-метод для возврата значения одного из параметров прямоугольника

    public double GetB() {
        return b;
    }// гет-метод для возврата значения одного из параметров прямоугольника



    public void printInfo() {
        System.out.println(" Пробег - " + GetA() + " Масса - " + GetB() );
    }

    @Override
    public float FindSquare() {
        return 0;
    }
}//реализация абстрактного метода вывода информации об объекте класса
