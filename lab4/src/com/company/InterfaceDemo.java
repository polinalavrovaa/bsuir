package com.company;

import java.util.Scanner;

public class InterfaceDemo {
    public static void main(String[] args) {

        Truck rect1 = new Truck(20000, 4000);
        rect1.printInfo(); //создание объектов круг и прямоугольник, вызов их методов
        System.out.println("Для выбора машины:");
        Scanner scan = new Scanner(System.in);
        double i = 0;
        System.out.println("Введите объем двигателя:");
        if (scan.hasNextDouble()) {
            i = scan.nextDouble();
        }

        double j = 0;
        System.out.println("Введите мощность двигателя:");

        if (scan.hasNextDouble()) {
            j = scan.nextDouble();
        }

        double k = 0;
        System.out.println("Введите количество посадочных мест:");


        if (scan.hasNextDouble()) {
            k = scan.nextDouble();
        }
        if (i >= 3000 || j >= 1000 || k >= 30) {
            System.out.println("Такой машины не существует");
        }// проверка треугольника на существование, вывод сообщения
        else {
                    System.out.println("Вы выбрали легковой автомобиль");
                    if (i == 10 || i == 10 || j == 5) {
                        Bus trian1 = new Bus(i, j, k, "минивен");
                        trian1.printInfo();
                    } else {
                        Bus trian1 = new Bus(i, j, k, "пикап");
                        trian1.printInfo();
                    }
                }
            }//создание треугольника правильного вида, согласно введённым пользователем сторонам, вызов его методов
        }
