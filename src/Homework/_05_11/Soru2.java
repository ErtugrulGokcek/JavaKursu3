package Homework._05_11;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz =");
        int sayi = oku.nextInt();

        if (sayi % 9 == 0 && sayi % 5 == 0) {
            System.out.println("Able to divide by 9 and 5");
        } else if (sayi % 4 == 0 && sayi % 5 == 0) {
            System.out.println("Able to divide by 4 and 5");
        } else {
            System.out.println("Not able to divide");


        }
    }
}