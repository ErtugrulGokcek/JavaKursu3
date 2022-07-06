package Homework._05_12;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Uc basamakli bir sayi giriniz =");
        int sayi = oku.nextInt();

        int birler = sayi%10;
        int onlar = sayi/10%10;
        int yuzler = sayi/100;

        String b = "";
        String o = "";
        String y = "";

        switch (birler) {
            case 1: b = "bir";break;
            case 2: b = "iki";break;
            case 3: b = "uc";break;
            case 4: b = "dort";break;
            case 5: b = "bes";break;
            case 6: b = "alti";break;
            case 7: b = "yedi";break;
            case 8: b = "sekiz";break;
            case 9: b = "dokuz";break;
            case 0: b = "";break;
        }
        switch (onlar) {
            case 1: o = "on ";break;
            case 2: o = "yirmi ";break;
            case 3: o = "otuz ";break;
            case 4: o = "kirk ";break;
            case 5: o = "elli ";break;
            case 6: o = "altmis ";break;
            case 7: o = "yetmis ";break;
            case 8: o = "seksen ";break;
            case 9: o = "doksan ";break;
            case 0: o = "";break;
        }
        switch (yuzler) {
            case 1: y = "yuz ";break;
            case 2: y = "iki yuz ";break;
            case 3: y = "uc yuz ";break;
            case 4: y = "dort yuz ";break;
            case 5: y = "bes yuz ";break;
            case 6: y = "alti yuz ";break;
            case 7: y = "yedi yuz ";break;
            case 8: y = "sekiz yuz ";break;
            case 9: y = "dokuz yuz ";break;
            case 0: y = "";break;
        }
        System.out.println(y + o + b);


    }
}
