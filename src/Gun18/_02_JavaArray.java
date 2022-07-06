package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // kullanicidan girecegi bir cumlede kac kelime oldugunu bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir cumle giriniz = ");
        String cumle = oku.nextLine();

        String cumle2 = cumle.toLowerCase();

        int toplam = 0;

        for (int i = 0; i < cumle2.length(); i++)
            if (cumle2.charAt(i) == ' ') {
                toplam++;

            }

        System.out.println("cumledeki kelime sayisi = " + (toplam + 1));
    }

}