package Homework._05_18;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        String[] array = new String[5];
        int enU = 0;
        String enU2 = "";
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("kelime giriniz = ");
            String kelime = oku.nextLine();
            array[i] = kelime;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > enU) {
                enU = array[i].length();
                enU2 = array[i];

            }
        }
        char e1 = enU2.charAt(0);
        char e2 = enU2.charAt(enU2.length()-1);
        String kelime2 = enU2.substring(1,enU2.length()-1);
        System.out.println("istenen = " + e2+kelime2+e1);
        System.out.println("array = " + enU2);

    }
}
