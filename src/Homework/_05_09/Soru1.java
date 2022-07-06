package Homework._05_09;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi = oku.nextInt();

        int onlar = (sayi/10%10);
        if (onlar%2==1) {
            System.out.println("tek");
        }
        if (onlar%2==0) {
            System.out.println("cift");
        }
    }
}
