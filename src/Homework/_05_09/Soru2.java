package Homework._05_09;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("sifre giriniz= ");
        String sifre = oku.nextLine();

        boolean check = sifre.equals("Bayrak");

        if (check) {
            System.out.println("Correct");
        }
        if (!check)
            System.out.println("Wrong");
        }
    }
