package Homework._05_16;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        String sayi = oku.nextLine();

        int i = (int)(Math.pow(10,sayi.length()-1));
        int j = 0;
        int toplam=0;
        do {
            int basamak = (int) (Integer.parseInt(sayi) / i %10*Math.pow(10,j)) ;
            toplam= (toplam+basamak);
            i=i/10;
            j++;
        } while (i>=10);
        System.out.println("toplam = " + (toplam + Integer.parseInt(sayi)%10*Math.pow(10, sayi.length()-1)));


    }
}
