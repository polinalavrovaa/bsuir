package com.company;
import java.io.*;
public class Patient {
    String surname;
    int number;
    boolean availability;
    Patient() throws IOException{
        String bolv;
//открываем символьный поток ввода
        BufferedReader input=new BufferedReader (new InputStreamReader(System.in,"Cp1251"));
        System.out.print("\nВведите фамилию пациента: ");
        this.surname=input.readLine();
        while(true) {
            System.out.print("\nВведите возраст: ");
            this.number= Integer.parseInt(input.readLine());
            if (this.number > 0 && this.number <= 100) {
                break;}
            System.out.print("\nОшибка! Повторите ввод"); }
        while(true){
            System.out.print("\nЯвляется женщиной (yes/no): ");
            bolv=input.readLine();
            if("yes".equals(bolv)){
                this.availability=true;
                break;
            }
            if("no".equals(bolv)){
                this.availability=false;
                break;
            }
            System.out.print("\nОшибка! Повторите ввод");
        }
    }
    //статический метод вывода информации из файла



    public static void OutputOfFile()throws IOException{
        File file = new File("document.doc");
//поток для вывода информации
        FileReader reader;
        char buffer[];
        int numb;
        buffer=new char[1];
        reader = new FileReader(file);
        do{
            numb=reader.read(buffer);
            System.out.print(buffer[0]);
        }while(numb==1);
        reader.close();
    }

    
    public static void main(String[] args) throws IOException{
        Patient[] wards;
        wards=new Patient[2];
        for (int i=0; i<2; i++)
            wards[i]=new Patient();
        File file = new File("document.doc");
        file.deleteOnExit(); //файл удалится после завершения работы виртуальной машины Java
//поток для записи в файл
        FileWriter writer;
        writer = new FileWriter(file,true);
        writer.append("\n Средний возраст: "+((wards[0].number+wards[1].number)/2)+"; ");
        if ((wards[0].availability && wards[1].availability)==true){
            writer.append("Все пациенты являются женщинами.\n");}
        else {
            if ((wards[0].availability || wards[1].availability)==true){
                writer.append("Одна женщина\n");
            }else writer.append("Среди пациентов нет женщин.\n");}
        writer.flush();
        writer.close();
        OutputOfFile();
    }
}