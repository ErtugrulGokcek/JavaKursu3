package Gun15;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayinin 2 ayni sayinin carpimina esit olup olmadigini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        int sayi = oku.nextInt();

        int sayac = 1;
        int carpim = 0;
        while (sayac <= sayi) {
            if (sayac*sayac == sayi) {
                carpim = sayac;
                break;

            }
                sayac++;
        }

        if (carpim>0)
            System.out.println("tam karedir =" + carpim);
        else
            System.out.println("tam kare degildir");
    }




}
