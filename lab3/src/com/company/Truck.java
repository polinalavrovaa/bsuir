//класс «Грузовой автомобиль» производный от «Автомобиля» содержит дополнительную информацию:
// грузоподъемность в тоннах, тип кузова (открытый или закрытый)

package com.company;

public class Truck extends Cars {
    private int capacity;
    private String body;

    public Truck(String str, String t, int p, int w, int m, int c, String b) {
        super(str,t,p,w,m); //вызов конструктора с параметрами из суперкласса
        capacity = c;
        body = b;
    }

    public Truck(String str, String t, int p,int w,int m) {
        super(str,t,p,w,m);// вызов конструктора с параметрами из суперкласса
        capacity = 1;
        body = "открытый";
    }


    public int GetDatacapacity() {
        return capacity;
    }

    public String GetDataBody(){
        return body;
    }
}
