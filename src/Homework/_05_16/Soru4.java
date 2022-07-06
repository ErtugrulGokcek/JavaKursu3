package Homework._05_16;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        String sayi = oku.nextLine();

        System.out.println("basamak sayisi = " + sayi.length());

    }
}
