package com.company;


public class Info { // класс для вывода информации о классах на экран
    public static void main(String[] args) {
        Truck truck1 = new Truck("maz", "2", 1, 2, 3, 4, "2");
        System.out.println("Truck 1 - Brand:" + truck1.GetDataBrand() + ", Type: " + truck1.GetDataType() + " Power:" + truck1.GetDataPower() + " Weight:" + truck1.GetDataWeight() + " Mileage:" + truck1.GetDataMileage() + " Capacity:" + truck1.GetDatacapacity() + " Body:" + truck1.GetDataBody() + "; ");
        Truck truck2 = new Truck("mazda", "boy", 1, 2, 3, 4, "1");
        System.out.println("Truck 2 - Brand:" + truck2.GetDataBrand() + ", Type: " + truck2.GetDataType() + " Power:" + truck2.GetDataPower() + " Weight:" + truck2.GetDataWeight() + " Mileage:" + truck2.GetDataMileage() + " Capacity:" + truck2.GetDatacapacity() + " Body:" + truck2.GetDataBody() + "; ");
        Bus bus1 = new Bus("fire", "ily", 1, 2, 3, 4, 5, 6);
        System.out.println(("Bus 1 - Brand:" + bus1.GetDataBrand() + ", Type: " + bus1.GetDataType() + " Power:" + bus1.GetDataPower() + " Weight:" + bus1.GetDataWeight() + " Mileage:" + bus1.GetDataMileage() + " Charge:" + bus1.GetDataa() + " Time:" + bus1.GetDatab() + " Number:" + bus1.GetDataNumber() + "; "));
        Bus bus2 = new Bus("toyota", "oil", 1, 2, 3, 4, 5);
        System.out.println(("Bus 2 - Brand:" + bus2.GetDataBrand() + ", Type: " + bus2.GetDataType() + " Power:" + bus2.GetDataPower() + " Weight:" + bus2.GetDataWeight() + " Mileage:" + bus2.GetDataMileage() + " Charge:" + bus2.GetDataa() + " Time:" + bus2.GetDatab() + " Number:" + bus2.GetDataNumber() + "; "));
        Automobil auto1 = new Automobil("bmv", "dizel", 2000, 5000, 6000, 20, 8);
        System.out.println("Automobil 1 - Brand:" + auto1.GetDataBrand() + ", Type: " + auto1.GetDataType() + " Power:" + auto1.GetDataPower() + " Weight:" + auto1.GetDataWeight() + " Mileage:" + auto1.GetDataMileage() + " Charge:" + auto1.GetDataa() + " Time:" + auto1.GetDatab() + "; ");
        Automobil auto2 = new Automobil("mercedes", "dizel", 3000, 4000, 7000);
        System.out.println("Automobil 2 - Brand:" + auto2.GetDataBrand() + ", Type: " + auto2.GetDataType() + " Power:" + auto2.GetDataPower() + " Weight:" + auto2.GetDataWeight() + " Mileage:" + auto2.GetDataMileage() + " Charge:" + auto2.GetDataa() + " Time:" + auto2.GetDatab() + "; ");


    }
}
