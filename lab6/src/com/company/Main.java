package com.company;

import java.io.*;

public class Main {

    String data;
    String filename;
    String choice;
    String choice2;
    RandomAccessFile fio;
    BufferedReader in;

    public Main() throws UnsupportedEncodingException {
        this.in = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));//создание объекта класса BufferedReader с возможностью ввода данных на русском языке(кодировка "Cp1251")
    }

    public void runConsol() throws IOException {
        while (true) {
            printMenu();//вызов метода вывода меню на экран
            choice = in.readLine();//ввод выбранного пункта меню
            if (choice.compareTo("1") == 0) {//сравнение выбранного пользователем пункта меню
                textIntoFile();//вызов метода ввода текста и записи его в файл
            } else if (choice.compareTo("2") == 0) {
                printRedactMenu();//вызов метода вывода возможных действий редактирования текста на экран
                choice2 = in.readLine();//ввод выбранного пункта
                if (choice2.compareTo("1") == 0) {
                    addStart();//вызов метода добавления текста в начало файла
                } else if (choice2.compareTo("2") == 0) {
                    addEnd();//вызов метода добавления текста в конец файла
                } else if (choice2.compareTo("3") == 0) {
                    addRandom();//вызов метода добавления текста в указаную позицию в файле
                }
            } else if (choice.compareTo("3") == 0) {
                textFromfile();//вызов метода чтения текста из файла и определение количества гласных, пробелов и общего количества букв
            } else if (choice.compareTo("4") == 0) {
                return;//выход из программы
            }
        }
    }

    public void printMenu() {//метод вывода меню на экран
        System.out.println("Введите ваш выбор:");
        System.out.println("1.Ввести текст и записать его в файл");
        System.out.println("2.Редактировать текст в файле");
        System.out.println("3.Прочитать текст из файла и выполнить над ним действия");
        System.out.println("4.Выход");
    }

    public void textIntoFile() throws IOException {//метод ввода текста и записи его в файл
        System.out.println("Введите текст:");
        data = in.readLine();//ввод текста
        System.out.println("Введите имя файла:");
        filename = in.readLine();//ввод имя файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");//создание файла с заданным именем
        fio.writeBytes(data);//запись текста в заданный файл
        fio.close();
        System.out.println("Выш текст сохранен.");
    }

    public void printRedactMenu() {//метод вывода возможных действий редактирования текста на экран
        System.out.println("Выберите действие:");
        System.out.println("1 - добавление текста в начало файла");
        System.out.println("2 - добавление текста в конец файла");
        System.out.println("3 - добавление текста в произвольную позицию в файле");
    }

    public void addStart() throws IOException {//метод добавления текста в начало файла
        System.out.println("Введите имя файла:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();//чтение информации из заданного файла
        System.out.println("Введите строку для добавления в начало:");
        String s;
        s = in.readLine();//ввод строки
        fio.seek(0);//переход в начало файла
        fio.writeBytes(s);//запись введенной строки
        fio.seek(s.length());//переход в конец записанной строки
        fio.writeBytes(data);//запись исходного текста после введенной строки
        fio.close();
        System.out.println("Cтрока записана в начало файла.");
    }

    public void addEnd() throws IOException {//метод добавления текста в конец файла
        System.out.println("Введите имя файла:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();//чтение информации из заданного файла
        System.out.println("Введите строку для добавления в конец:");
        String s;
        s = in.readLine();//ввод строки
        fio.seek(fio.length());//переход в конец файла
        fio.writeBytes(s);//запись введенной строки в конец файла
        fio.close();
        System.out.println("Cтрока записана в конец файла.");
    }

    public void addRandom() throws IOException {//метод добавления текста в указаную позицию в файле
        System.out.println("Введите имя файла:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "rw");
        System.out.println("Введите строку для добавления в указанную позицию в файле:");
        String s;
        s = in.readLine();//ввод строки
        System.out.println("Введите необходимую позицию в файле:");
        int n;
        n = Integer.parseInt(in.readLine());//ввод позиции
        fio.seek(n);//смещение на n позицию в файле
        data = fio.readLine();//чтение файла начиная с позиции n
        fio.seek(n);
        fio.writeBytes(s);//запись введенной строки с позиции n
        fio.writeBytes(data);//запись прочитанного с позиции n текста после введенной строки
        fio.close();
        System.out.println("Cтрока записана в файл.");
    }

    public void textFromfile() throws IOException {//метод чтения текста из файла и определение количества гласных, пробелов и общего количества букв
        System.out.println("Введите имя файла:");
        filename = in.readLine();//ввод имени файла, которое следует вводить учитывая расширение, например text.txt
        fio = new RandomAccessFile(new File(filename), "r");
        data = fio.readLine();//чтение информации из заданного файла
        fio.close();
        System.out.println("Информация из файла: " + data);//вывод информации из файла



        int Java = 0, hello = 0,u = 0;//установление счетчика количества пробелов,
        char[] line = new char[100];
        char ch;
        for (int i = 0; i < data.length(); i++) {
            ch = Character.toLowerCase(data.charAt(i)); //преобразоваине всех символов строки к строчным для корректного подсчета
            line[i] = ch;
            u++;
            if (Character.isWhitespace(ch)) {//проверка, является и символ пробелом

            }
        }
        for (int i = 0; i < u-4; i++) {
            if ((line[i] == 'j')&&(line[i+1] == 'a')&&(line[i+2] == 'v')&&(line[i+3] == 'a')){
                Java+=1;
            }
            if ((line[i] == 'h')&&(line[i+1] == 'e')&&(line[i+2] == 'l')&&(line[i+3] == 'l')&&(line[i+4] == 'o')){
                hello+=1;
            }
        }

        System.out.print("Слов Java в тексте: " + Java + " \nHello: " + hello + " \n ");


    }
    public static void main(String args[]) throws UnsupportedEncodingException, IOException {
        Main n = new Main();//создание объекта класса WorkWithString
        n.runConsol();//вызов метода, выполняющего действия над файлом и строкой
    }
}


