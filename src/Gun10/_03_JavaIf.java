package Gun10;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // girilen iki sayidan buyuk olaninin degerini ekrana yazdiriniz
        // esit ise esit yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz=");
        int sayi1 = oku.nextInt();

        System.out.print("Ikinci sayiyi giriniz=");
        int sayi2 = oku.nextInt();

        if (sayi1>sayi2) {
            System.out.println("sayi1 = " + sayi1);
        }
        if (sayi2>sayi1) {
            System.out.println("sayi2 = " + sayi2);
        }
        if (sayi1==sayi2) {
            System.out.println("esit = " + "esit");
        }
    }
}
