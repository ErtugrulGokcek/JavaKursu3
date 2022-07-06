package Gun11;

import java.util.Scanner;

public class _04_MantiksaIfadeler {
    public static void main(String[] args) {
        // mantıksal (logical) ifadeler
        // && -> ve    || -> veya
        // girilen sayi pozitif ve tek ise ekrana uygun sayi girildi degilse uygun sayi girilmedi yazdirin

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz =");
        int sayi = oku.nextInt();

        if (sayi > 0 && sayi%2==1) {
            System.out.println("uygun sayi girildi");
        }
        else {
            System.out.println("uygun sayi girilmedi");
        }

    }
}
