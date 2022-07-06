package Homework._05_09;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Yeni sifre giriniz = ");
        String sifre = oku.nextLine();

        int uzunluk = sifre.length();

        if (uzunluk<8) {
            System.out.println("Sifreniz kabul edilmedi");
        }
        if (uzunluk>=8) {
            System.out.println("Kabul edildi");
        }
    }
}
