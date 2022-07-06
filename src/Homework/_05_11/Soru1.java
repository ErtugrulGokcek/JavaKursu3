package Homework._05_11;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("sayinin tam kismini giriniz =");
        String sayi1 = oku.nextLine();

        System.out.print("sayinin ondalik kismini giriniz =");
        String sayi2 = oku.nextLine();

        int u1 = sayi2.length();
        int s1 = Integer.parseInt(sayi1);
        int s2 = Integer.parseInt(sayi2);

        double sayi = (s1 + s2/(Math.pow(10,u1)));
        System.out.println("sayi = " + sayi);


    }
}
