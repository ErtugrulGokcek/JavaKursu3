package Gun05;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {
        // girilen bir adi ekrana yazdiriniz

        Scanner oku=new Scanner(System.in);

        System.out.print("Lutfen Adinizi Giriniz:");

        String ad= oku.next(); // next() -> bir kelime okumak icin

        System.out.println("ad = " + ad);

    }
}
