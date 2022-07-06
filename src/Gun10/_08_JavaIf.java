package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin birler ve onlar basamaginin esit olup olmadigini yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz =");
        int sayi = oku.nextInt();

        int birler = (sayi%10);
        int onlar = (sayi/10%10);

        if (birler==onlar) {
            System.out.println("esittir");
        }
        if (birler!=onlar) {
            System.out.println("esit degildir");
        }

    }
}
