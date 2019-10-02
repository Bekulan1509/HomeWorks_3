package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Nika", "Bermet", "Aigerym"};
        for (int name = 0; name < 3; name++) {
            switch (name){
                case 0:
                    System.out.println("Доброе утро " + names[0]);
                    break;
                case 1:
                    System.out.println("Добрый день " + names[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер " + names[2]);
                    break;
            }
        }

    }
}


