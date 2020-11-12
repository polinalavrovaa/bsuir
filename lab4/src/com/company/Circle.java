package com.company;

public class Circle implements Object, Cars {// класс, реализующий 2 интерфейса
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }// конструктор класса Circle

    private double GetRad() {
        return rad;
    }// гет-метод для радиуса

    public float FindSquare() {
        return (float) (3.14 * rad * rad);
    }// реализация абстрактного метода для нахождения площади круга

    public void printInfo() {
        System.out.println("Радиус - " + GetRad() + " Площадь - " + FindSquare());

    }// реализация абстрактного метода вывода информации об объекте класса для круга

}
