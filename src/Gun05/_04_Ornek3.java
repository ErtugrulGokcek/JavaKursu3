package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        // Kullanicidan adini ve soyadını ayrı ayrı okutarak alip birlikte ekrana yaziniz

        Scanner oku=new Scanner(System.in);

        System.out.print("Adinizi Giriniz=");

        String Ad= oku.nextLine();

        System.out.print("Soyadinizi Giriniz=");

        String Soyad= oku.nextLine();

        System.out.println("Ad ve Soyad = "+ Ad +" "+Soyad);
    }
}
