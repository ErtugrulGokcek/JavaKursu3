package Homework._05_05;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Cumleyi giriniz =");
        String cumle = oku.nextLine();

        String cumle2 = cumle.trim();
        int uzunluk = cumle2.length();

        System.out.println("ilk ve son harfler = " + cumle2.charAt(0) + " " + cumle2.charAt(uzunluk-1));

    }
}
