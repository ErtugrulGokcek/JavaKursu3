package Homework._05_16;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cumle giriniz = ");
        String cumle = oku.nextLine();

        String cumle2 = cumle.toLowerCase();
        int uzunluk = cumle.length();
        int i = 0;
        int toplam = 0;

        do {
            if (cumle2.charAt(i) == ' ') {
                toplam++;
                i++;
            }else
                i++;

        }while (i <= uzunluk-1) ;
        System.out.println("cumledeki kelime sayisi = " + (toplam+1));


    }
}
