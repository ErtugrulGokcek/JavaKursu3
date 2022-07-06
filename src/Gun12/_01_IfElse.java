package Gun12;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // yanyana aralarında bir boslukla girilen 2 int sayinin birbirine esit olup olmadigini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("2 sayiyi boslukla giriniz =");
        String sayi = oku.nextLine();

        int bosluk = sayi.indexOf(" ");
        String sayistr1= sayi.substring(0,bosluk);
        String sayistr2= sayi.substring(bosluk+1);

        int sayi1 = Integer.parseInt(sayistr1);
        int sayi2 = Integer.parseInt(sayistr2);

        if (sayi1 == sayi2) {
            System.out.println("esittir");
        }
        else {
            System.out.println("esit degildir");
        }

    }
}
