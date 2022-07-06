package Homework._05_11;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz =");
        int sayi1 = oku.nextInt();
        System.out.print("ikinci sayiyi giriniz =");
        int sayi2 = oku.nextInt();
        System.out.print("ucuncu sayiyi giriniz =");
        int sayi3 = oku.nextInt();

        System.out.println("en kucuk = " + Math.min(sayi1,Math.min(sayi2,sayi3)));
    }
}
