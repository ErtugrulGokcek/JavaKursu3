package Gun10;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi = oku.nextInt();

        if ((sayi % 2) == 1) {
            System.out.println("tekdir");
        }
        if ((sayi % 2) == 0) {
            System.out.println("cifttir");
        }

    }
}
