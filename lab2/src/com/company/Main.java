package com.company;

public class Main {

    public static void main(String[] args) {

        Patient w1 = new Patient(); //создание объекта w1
        Patient w2 = new Patient(); //создание объекта w2
        Patient w3 = new Patient(); //создание объекта w3


        w1.setNumber(10);
        w1.setSurname("Левкович");
        w1.setGender(false);//заполнение полей объекта w1 с помощью сеттеров
        System.out.println("Информация о пациенте №1:");
        w1.Print();//вывод информации об объекте w1

        w2.setNumber(20);
        w2.setSurname("Лаврова");
        w2.setGender(true);
        System.out.println("Информация о пациенте №2:");
        w2.Print();



    }
}