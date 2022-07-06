package Homework._05_09;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("birinci kelimeyi giriniz =");
        String sayi1 = oku.nextLine();

        System.out.print("ikinci kelimeyi giriniz =");
        String sayi2 = oku.nextLine();

        int u1 = sayi1.length();
        int u2 = sayi2.length();

        if(u1 == u2) {
            System.out.println("ayni uzunlukta");
        }
        if (u1 != u2) {
            System.out.println("ayni uzunlukta degil");
        }
    }
}
