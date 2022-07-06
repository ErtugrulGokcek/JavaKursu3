package Gun10;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // girilen bir nota gore 50 den buyuk esit ise gectiniz degilse kaldiniz yazin

        Scanner oku = new Scanner(System.in);
        System.out.print("Notunuzu giriniz =");
        int not = oku.nextInt();

        if (not>=50) {
            System.out.println("gectiniz");
        }
        if (not<50) {
            System.out.println("kaldiniz");
        }

    }
}
