package Homework._05_04;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Cumle Giriniz=");

        String cumle = oku.nextLine();

        int harf2 = cumle.indexOf(" ");
        String cumle1 = cumle.replaceFirst(" ","");

        int harf3 = cumle1.indexOf(" ");
        String cumle2 = cumle1.replaceFirst(" ","");

        int harf4 = cumle2.indexOf(" ");
        String cumle3 = cumle2.replaceFirst(" ","");

        int harf5 = cumle3.indexOf(" ");
        String cumle4 = cumle3.replaceFirst(" ","");

        int harf6 = cumle4.indexOf(" ");
        String cumle5 = cumle4.replaceFirst(" ","");

        System.out.println("Kelimelerin ilk harfleri = " + cumle.charAt(0)+" " + cumle1.charAt(harf2)+ " " + cumle3.charAt(harf3) + " " + cumle4.charAt(harf4) + " "
        + cumle5.charAt(harf5));




    }
}
