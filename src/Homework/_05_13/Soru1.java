package Homework._05_13;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int carpim = 1;

        System.out.print("Bir sayi giriniz =");
        int sayi = oku.nextInt();
        while (sayac <= sayi) {
            carpim = carpim * sayac;
            sayac++;
        }
        System.out.println("carpim = " + carpim);
    }
}


