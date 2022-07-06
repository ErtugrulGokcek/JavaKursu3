package Gun09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen 3 basamakli sayinin tersi olan sayiyi bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        Integer sayi = oku.nextInt();

        System.out.println("tersi = " + ((sayi%10*100)+(sayi/10%10*10)+(sayi/100)));


    }
}
