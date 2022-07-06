package Homework._05_05;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cumle giriniz =");
        String cumle = oku.nextLine();

        int uzunluk = cumle.length();
        int bosluk = cumle.lastIndexOf(" ");

        System.out.println("Son kelime = " + cumle.substring(bosluk+1,uzunluk));


    }
}
