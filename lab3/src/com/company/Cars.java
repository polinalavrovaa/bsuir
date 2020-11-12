//"Легковой автомобиль" (карбюраторный или дизельный), мощность двигателя, масса автомобиля, пробег в км.
// +марка автомобиля, тип двигателя

package com.company;

public class Cars
{
private String brand;
private String type;
private int power;
private int weight;
private int mileage;
public Cars(String str, String t, int p, int w, int m) {
        brand = str;
        type = t;
        power = p;
        weight = w;
        mileage = m;
        }

        public float GetDataPower(){
        return power;
        }
        public float GetDataWeight(){
        return weight;
        }
        public float GetDataMileage(){
        return mileage;
        }
        public String GetDataBrand(){
        return brand;
        }
        public String GetDataType(){
        return type;
        }

        void show(){
        System.out.println("марка: " + brand+ ", тип двигателя: " + type+ ", мощность двигателя: " + power+", масса: " + weight+", пробег в км: " + mileage);
        }
        }
