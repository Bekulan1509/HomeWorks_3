package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Nika", "Bermet", "Aigerym"};
        names = addElement(names, "Marat");

        for (String name : names) {
            switch (name) {
                case "Nika":
                    System.out.println("Доброе утро " + names[0]);
                    break;
                case "Bermet":
                    System.out.println("Добрый день " + names[1]);
                    break;
                case "Aigerym":
                    System.out.println("Добрый вечер " + names[2]);
                    break;
                case "Marat":
                    System.out.println("Cпокойной ночи " + names[3]);
                    break;
            }
        }
    }

    static String[] addElement(String[] a, String e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
}