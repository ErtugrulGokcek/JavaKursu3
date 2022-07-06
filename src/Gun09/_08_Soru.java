package Gun09;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // kullanicinin girecegi 2 sayinin birbirine esit olup olmadigini yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz=");
        int sayı = oku.nextInt();

        System.out.print("İkinci sayiyi giriniz=");
        int sayı2=oku.nextInt();

        System.out.println("esit mi? = " + (sayı==sayı2));

    }
}
