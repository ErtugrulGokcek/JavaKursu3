package Homework._05_06;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi = oku.nextInt();

        System.out.println("sonuc = " + (sayi/100%10));
    }
}
