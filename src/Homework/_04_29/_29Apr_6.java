package Homework._04_29;

import java.util.Scanner;

public class _29Apr_6 {
    public static void main(String[] args) {
        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Dogum tarihinizi giriniz (G/A/Y)=");

        String Gun= okuyucu.nextLine();

        System.out.println("Gun = " + Gun);
    }
}
