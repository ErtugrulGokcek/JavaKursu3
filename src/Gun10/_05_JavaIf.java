package Gun10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin birler basamagini yazi ile yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi = oku.nextInt();

        if (sayi%10==0) {
            System.out.println("sifir");
        }
        if (sayi%10==1) {
            System.out.println("bir");
        }
        if (sayi%10==2) {
            System.out.println("iki");
        }
        if (sayi%10==3) {
            System.out.println("uc");
        }
        if (sayi%10==4) {
            System.out.println("dort");
        }
        if (sayi%10==5) {
            System.out.println("bes");
        }
        if (sayi%10==6) {
            System.out.println("alti");
        }
        if (sayi%10==7) {
            System.out.println("yedi");
        }
        if (sayi%10==8) {
            System.out.println("sekiz");
        }
        if (sayi%10==9) {
            System.out.println("dokuz");
        }


    }
}
