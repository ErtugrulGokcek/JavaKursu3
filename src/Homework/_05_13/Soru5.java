package Homework._05_13;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        int sayac1 = 10;
        int sayac2 = 0;
        int dogru = 0;
        int yanlis = 0;
        int sayi = (int) (Math.random() * (9999 - 1000) + 1000);
        System.out.println("sayi = " + sayi);
        String sayi1 = Integer.toString(sayi);

        Scanner oku = new Scanner(System.in);
        System.out.print("Dort basamakli bir sayi giriniz =");
        int girdi = oku.nextInt();
        String girdi2 = Integer.toString(girdi);
        if (girdi2.length() != 4) {
            System.out.println("Dort basamakli bir sayi giriniz =");
        } else if
        (sayi != Integer.parseInt(girdi2))
            do {
                if (sayi1.charAt(sayac2) == girdi2.charAt(sayac2))
                    System.out.println("sayi1 = " + sayi1.charAt(sayac2));
                System.out.println("girdi2 = " + girdi2.charAt(sayac2));
                dogru++;
                sayac2++;

            } while (sayac2 == 4);
        System.out.println("dogru = " + dogru);
        System.out.println("yanlis = " + yanlis);
    }


}

