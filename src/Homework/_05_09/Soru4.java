package Homework._05_09;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("kelime giriniz =");
        String kelime = oku.nextLine();

        boolean check = kelime.contains("A");

        if (check) {
            System.out.println("A harfi var");
        }
        if (!check) {
            System.out.println("A harfi yok");
        }
    }
}
