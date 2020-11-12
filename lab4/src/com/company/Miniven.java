package com.company;

public class Miniven extends Automobil {//класс-наследник класса треугольник

    public Miniven(double x, double y, double z, String type) {
        super(x, y, z, type);//вызов конструктора супер-класса
    }//конструктор класса

    public float FindSquare() {
        return (float) (x * x * (Math.sqrt(3)) / 4);
    }//реализация абстрактного метода нахождения площади для равностороннего треугольника

    public void printInfo() {
        System.out.println("Сторона1 - " + GetX() + " Сторона2 -" + GetY() + " Сторона3 - " + GetZ() + " Тип - " + GetType() + " Площадь - " + FindSquare());
    }// реализация абстрактного метода для вывода информации о равностороннем треугольнике

    public String GetType() {
        return type;
    }// реализация абстрактного гет-метода

}
