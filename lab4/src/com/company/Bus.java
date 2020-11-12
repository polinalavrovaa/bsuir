package com.company;

public class Bus extends Automobil {
    //класс-наследник треугольника, реализующий  абстрактные методы, нереализованные в супер-классе
    Bus(double x, double y, double z, String type) {
        super(x, y, z, type);//вызов конструктора супер-класса
    }//конструктор класса



    public void printInfo() {
        System.out.println("Объем двигателя - " + GetX() + " Мощность двигателя -" + GetY() + " Количество мест - " + GetZ() + " Тип - " + GetType() );
    }//реализация абстрактного метода

    public String GetType() {
        return type;
    }// реализация абстрактного гет-метода

    @Override
    public float FindSquare() {
        return 0;
    }
}
