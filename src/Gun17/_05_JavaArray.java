package Gun17;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int dizi[] = new int[7];
        int toplam = 0;
        int ortalama=0;
        int j=0;

        Scanner oku = new Scanner(System.in);

        for (int i = 0;i< dizi.length;i++){
            System.out.print("sayi giriniz = ");
            dizi[i] = oku.nextInt();

            toplam=toplam + dizi[i];
        }
        ortalama = toplam/ dizi.length;
        for (int i=0; i< dizi.length;i++){
            if (dizi[i]>ortalama && dizi[i]%2==1)
                j++;
        }
        System.out.println("ortalamadan buyuk ve tek sayisi = " + j);
    }
}
