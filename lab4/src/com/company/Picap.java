package com.company;

    public class Picap extends Automobil {// класс-наследник класса треугольник, который реализует 2 интерфейса

        public Picap(double a, double b, double c, String type) {
            super(a, b, c, type);//вызов конструктора супер-класса
        }//конструктор класса
        public float FindSquare() {
            return (float) ((x*y)/2);
        }//реализация абстрактного метода поиска площади для данного вида треугольника

        public void printInfo() {
            System.out.println("Катет1 - "+GetX()+" Катет2 -"+GetY()+" Гипотенуза - "+GetZ()+" Тип - " +GetType()+" Площадь - "+FindSquare());
        }// реализация метода вывода информации для прямоугольного треугольника
        public String GetType(){
            return type;
        }// реализация абстрактного метода, возвращается тип треугольника

    }






