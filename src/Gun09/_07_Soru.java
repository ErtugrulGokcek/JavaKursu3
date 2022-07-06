package Gun09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //  girilen bir sayinin tek sayi olup olmadigini yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz =");
        int sayi = oku.nextInt();

        boolean tekMi = ((sayi%2)!=0);

        System.out.println("tekMi = " + tekMi);
        System.out.println("tekMi = " + (sayi%2==1) );


    }
}
