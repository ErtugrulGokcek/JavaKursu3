package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMethod {
    public static void main(String[] args) {
        // Split: bir stringi parcalara ayirmak

        // kullanicidan alacaginiz cumleyi kelimelerine gore alt alta yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir cumle giriniz = ");
        String cumle = oku.nextLine();

        String [] kelimeler = cumle.split(" ");

        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        System.out.println("kelimeler sayisi = " + kelimeler.length);

        for (int i = 0; i< kelimeler.length;i++)
            System.out.println("kelimeler = " + kelimeler[i]);


    }
}
