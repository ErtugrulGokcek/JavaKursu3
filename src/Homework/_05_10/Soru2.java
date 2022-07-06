package Homework._05_10;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz =");
        int sayi = oku.nextInt();

        int birler = sayi%10;
        int onlar = sayi/10%10;

        if(birler!=onlar && birler/2!=1 && onlar/2!=1) {
            System.out.println("tek ve esittir");
        }
        else {
            System.out.println("tek ve esit degildir");
        }
    }
}
