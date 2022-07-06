package Gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //otopark ucretleri:
        // 3 saate kadar 10tl 5 saate kadar 15tl 5ten buyukse 20 tl dir
        // kullanicidan kac saat kaldigini alarak ucret yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("saat giriniz =");
        int saat = oku.nextInt();

        if (saat <= 3) {
            System.out.println("10 tl");
        } else if (saat <= 5) {
            System.out.println("15 tl");
        }
        else {
            System.out.println("20 tl");
        }
    }

}