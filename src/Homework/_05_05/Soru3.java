package Homework._05_05;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("3 kelimelik bir cumle giriniz =");
        String cumle = oku.nextLine();

        String cumle2 = cumle.trim();
        int bosluk1 = cumle2.indexOf(" ");
        int bosluk2 = cumle2.lastIndexOf(" ");

        System.out.println("ilk karakterler = " + cumle2.charAt(0) + " " + cumle2.charAt(bosluk1+1) + " " + cumle2.charAt(bosluk2+1));


    }
}
