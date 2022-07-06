package Gun11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // girilen bir sayinin tek mi cift mi oldugunu yaziniz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz =");
        int sayi = oku.nextInt();

        if (sayi%2==1) {
            System.out.println("tek");
        }
        else {
            System.out.println("cift");
        }

    }
}
