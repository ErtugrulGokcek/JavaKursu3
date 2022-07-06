package Gun15;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        // girilen bir sayiya kadar olan sayilarin carpimini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz =");
        int sayi = oku.nextInt();

        int i=1;
        int carpim=1;

        for (i=1;i<sayi;i++) {
            carpim=carpim*i;
        }
        System.out.println("carpim = " + carpim);


    }

}
