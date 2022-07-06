package Homework._05_05;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kredi karti no giriniz =");
        String kartNo = oku.nextLine();

        int uzunluk = kartNo.length();
        int bosluk = kartNo.lastIndexOf(" ");
        String son4 = kartNo.substring(bosluk,uzunluk);
        String gizli = kartNo.substring(0,bosluk);

        String protectd = gizli.replaceAll("[0-9]","*");

        System.out.println("Protected Kart no = " + protectd.concat(son4));


    }
}
