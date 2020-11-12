package com.company;

public class Patient{

    private int number;
    private String surname ;
    private boolean gender;

    public void setNumber (int number){
        this.number = number;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender( boolean gender) {
        this.gender = gender;
    }


    public Patient() {
    }

    public int getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isGender() {
        return gender;
    }

    public void Print() {
        System.out.println("Возраст: " + number);
        System.out.println("Фамилия пациента: " + surname);
        if(gender) {
            System.out.println("Является женщиной");
            System.out.println("Cредний возраст: " + 15);
        }
        else {
            System.out.println("Не является женщиной");
        }


    }
}