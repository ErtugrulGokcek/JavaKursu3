package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // girilen bir ogrencinin notuna gore 50den buyuk esit ise gecitiniz kucuk ise kaldiniz yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Notunuzu giriniz =");
        int not = oku.nextInt();

        if (not >= 50) {
            System.out.println("gectiniz");
        }
        else {
            System.out.println("kaldiniz");
        }

    }
}
