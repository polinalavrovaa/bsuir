package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Reader extends JFrame {
    String text1;
    String text2;
    int k;
    Object boxA, boxB, boxC;
    File file = new File("file.txt");
    static JLabel l1, l11, l2, l3, l4;
    JComboBox box_1, box_2, box_3;
    JRadioButton flag1, flag2;
    ButtonGroup bg;
    static JButton b, del;
    static JTextField text;
    static JTextField text11;
    static JTextArea area;
    static String[] box1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    static String[] box2 = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    static String[] box3 = {"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};

    public Reader(String str) {
        super(str);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("Внесение в базу");
        del = new JButton("Очистить");
        text = new JTextField(9);
        text11 = new JTextField(9);
        area = new JTextArea(9, 9);
        l1 = new JLabel("Автор книги");
        l11 = new JLabel("Название книги");
        l2 = new JLabel("Описание книги");
        l3 = new JLabel("Дата начала чтения");
        l4 = new JLabel("Прочтена ли книга");
        box_1 = new JComboBox(box1);
        box_2 = new JComboBox(box2);
        box_3 = new JComboBox<Object>(box3);
        flag1 = new JRadioButton("да");
        flag2 = new JRadioButton("нет");
        bg = new ButtonGroup();
        bg.add(flag1);
        bg.add(flag2);

        setLayout(null);
        b.setSize(200, 30);
        b.setLocation(150, 400);
        del.setSize(100, 30);
        del.setLocation(10, 400);
        text.setSize(220, 25);
        text.setLocation(250, 20);
        text11.setSize(220, 25);
        text11.setLocation(250, 50);
        area.setSize(220, 110);
        area.setLocation(250, 85);
        l1.setSize(200, 25);
        l1.setLocation(30, 20);
        l11.setSize(200, 25);
        l11.setLocation(30, 50);
        l2.setSize(220, 25);
        l2.setLocation(30, 80);
        l3.setSize(200, 25);
        l3.setLocation(30, 250);
        l4.setSize(200, 25);
        l4.setLocation(30, 310);
        box_1.setSize(70, 25);
        box_1.setLocation(220, 250);
        box_2.setSize(100, 25);
        box_2.setLocation(300, 250);
        box_3.setSize(90, 25);
        box_3.setLocation(410, 250);
        flag1.setSize(50, 25);
        flag1.setLocation(250, 310);
        flag2.setSize(60, 25);
        flag2.setLocation(300, 310);

        add(b);
        add(del);
        add(text);
        add(text11);
        add(area);
        add(l1);
        add(l11);
        add(l2);
        add(l3);
        add(l4);
        add(box_1);
        add(box_2);
        add(box_3);
        add(flag1);
        add(flag2);

        b.addActionListener(new ButtonActionListener());
        flag1.addActionListener(new FlagActionListener());
        flag2.addActionListener(new FlagActionListener());
        del.addActionListener(new DelActionListener());
        box_1.addActionListener(new BoxActionListener());
        box_2.addActionListener(new BoxActionListener());
        box_3.addActionListener(new BoxActionListener());
    }

    public class ButtonActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
                try (FileWriter out = new FileWriter(file, true)) {
                    String text1 = text.getText();
                    String text2 = text11.getText();
                    String area2 = area.getText();
                    out.write(text1 + "\n");
                    out.write(text2 + "\n");
                    out.write(area2 + "\n");
                    if (k == 1)
                        out.write("Книга прочтена. " + "\n");
                    else if (k == -1)
                        out.write("Книга в процессе чтения. " + "\n");
                    out.write(" (Дата начала чтения:" + boxA + " " + boxB + " " + boxC + ")");
                } catch (IOException e1) {
                    throw new RuntimeException(e1);
                }
            } catch (RuntimeException runtimeException) {
                runtimeException.printStackTrace();
            }
        }
    }

    public class FlagActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            k = 0;
            if (e.getSource() == flag1) {
                k++;
            } else if (e.getSource() == flag2) {
                k--;
            }
        }
    }

    public static class DelActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == del) {
                text.setText(null);
                area.setText(null);
            }
        }
    }

    public class BoxActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == box_1) {
                boxA = box_1.getSelectedItem();
            }
            if (e.getSource() == box_2) {
                boxB = box_2.getSelectedItem();
            }
            if (e.getSource() == box_3) {
                boxC = box_3.getSelectedItem();
            }
        }
    }
}