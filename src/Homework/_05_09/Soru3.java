package Homework._05_09;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("kelime giriniz =");
        String kelime = oku.nextLine();

        int sonHarf = kelime.length();

        if (kelime.charAt(0) == kelime.charAt(sonHarf-1)) {
            System.out.println("ayni");
        }
        if (kelime.charAt(0) != kelime.charAt(sonHarf-1)) {
            System.out.println("farkli");
        }

    }
}
