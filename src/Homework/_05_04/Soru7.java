package Homework._05_04;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Cumle Giriniz=");

        String cumle=oku.nextLine();

        int uzunluk1 = cumle.length();

        String bosluksuzCumle = cumle.replace(" ","");

        int uzunluk2 = bosluksuzCumle.length();

        System.out.println("Kelime Sayisi = " + (uzunluk1-uzunluk2+1));


    }
}
