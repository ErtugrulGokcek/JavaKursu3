package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // girilen bir sayinin pozitif, negatif veya sifir oldugunu yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz =");
        int sayi = oku.nextInt();

        if (sayi<0) {
            System.out.println("negatiftir");
        }
        else if (sayi>0) {
            System.out.println("pozitiftir");
        }
        else {
            System.out.println("sifirdir");
        }
    }




}
