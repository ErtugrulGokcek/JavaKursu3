package Gun10;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin negatif mi pozitif mi oldugunu yazdiriniz
        // sifir ise sifir yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();

        if (sayi < 0)
        {
            System.out.println("negatiftir");
        }
        if (sayi > 0)
        {
            System.out.print("pozitiftir");
        }
        if (sayi == 0)
        {
            System.out.println("sifirdir");
        }

    }
}
