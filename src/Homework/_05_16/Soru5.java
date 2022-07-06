package Homework._05_16;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        String sayi = oku.nextLine();

        if(sayi.charAt(sayi.length()-1) == sayi.charAt(0))
            System.out.println("esittir");
        else
            System.out.println("esit degildir");
    }
}
