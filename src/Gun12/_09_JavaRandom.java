package Gun12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // girilen bir sayiya kadar random sayi ureterek tahmin etmeye calisiniz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz =");
        int sayi = oku.nextInt();

        if (sayi == (int)(Math.random()*10))
            System.out.println("tebrikler");
        else
            System.out.println("bilemediniz");


    }
}
