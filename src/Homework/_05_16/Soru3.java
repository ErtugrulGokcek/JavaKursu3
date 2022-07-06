package Homework._05_16;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        int i = 0;
        do {
            System.out.print("bir sayi giriniz = ");
            int sayi = oku.nextInt();

            if (sayi%2==0) {
                toplam=toplam+sayi;
            }else
                break;
        }while (i<=10) ;
        System.out.println("toplam = " + toplam);
    }
}
