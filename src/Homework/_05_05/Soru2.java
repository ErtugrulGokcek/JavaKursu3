package Homework._05_05;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("3 kelimelik bir cumle giriniz =");
        String cumle = oku.nextLine();

        String cumle2 = cumle.trim();
        int uzunluk = cumle2.length();
        int bosluk1 = cumle2.indexOf(" ");
        int bosluk2 = cumle2.lastIndexOf(" ");

        System.out.println("ilk kelime = " + cumle2.substring(0,bosluk1));
        System.out.println("ikinci kelime = " + cumle2.substring(bosluk1+1 , bosluk2));
        System.out.println("ucuncu kelime = " + cumle2.substring(bosluk2+1 , uzunluk));





    }
}
