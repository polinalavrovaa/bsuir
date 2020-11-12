package com.company;

public abstract class Automobil implements Object, Cars {// класс объявлен как абстрактный, так как в нём не реализованы абстрактные методы реализуемых интерфейсов. ОНИ ДОЛЖНЫ БЫТЬ РЕАЛИЗОВАНЫ В КЛАССАХ-НАСЛЕДНИКАХ!!!
    public double x, y, z;
    String type;

    public Automobil(double x, double y, double z, String type) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
    }// конструктор супер-класса

    public double GetX() {
        return x;
    }//гет-метод

    public double GetY() {
        return y;
    }//гет-метод

    public double GetZ() {
        return z;
    }//гет-метод

    public abstract String GetType();
//абстрактный гет-метод
}
