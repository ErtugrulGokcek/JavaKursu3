package Homework._05_10;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("bir kelime girin =");
        String kelime = oku.nextLine();

        String kelime2 = kelime.toLowerCase();

        if (kelime2.contains("a") || kelime2.contains(" ")) {
            System.out.println("a harfi veya bosluk vardir");
        }
        else {
            System.out.println("a harfi ya da bosluk yoktur");
        }

    }
}
