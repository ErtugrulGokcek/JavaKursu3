package Gun21;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        int toplam = 0;

        do {
            System.out.println(toplam += sayiOku());
        } while (sayiOku()!=0);

    }

    public static int sayiOku() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        return oku.nextInt();
    }
}

