package Homework._05_10;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("birinci sayiyi girin =");
        int sayi1 = oku.nextInt();
        System.out.print("ikinci sayiyi girin =");
        int sayi2 = oku.nextInt();
        System.out.print("ucuncu sayiyi girin =");
        int sayi3 = oku.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3) {
            System.out.print("enbuyuk sayi =" +sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("enbuyuk sayi =" +sayi2);
        }
        else {
            System.out.println("enbuyuk sayi =" +sayi3);
        }
    }
}
