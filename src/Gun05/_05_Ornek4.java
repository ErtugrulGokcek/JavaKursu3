package Gun05;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz

        Scanner oku=new Scanner(System.in);

        System.out.print("İlk Sayiyi Giriniz=");

        Integer Ilksayi= oku.nextInt();

        System.out.print("İkinici Sayiyi Giriniz=");

        Integer Ikincisayi= oku.nextInt();

        int Toplam=Ilksayi+Ikincisayi;

        System.out.println("Toplam = " + Toplam); //1. yontem

        System.out.println("Toplam = " + (Ilksayi+Ikincisayi)); // 2. yontem


    }
}
