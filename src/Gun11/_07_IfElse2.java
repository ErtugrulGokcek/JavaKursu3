package Gun11;

import java.util.Scanner;

public class _07_IfElse2 {
    public static void main(String[] args) {
        // girilen yeni bir password un kurallara uygunlugunu kontrol ediniz
        // 1- en az 8 karakter
        // icinde pass kelimesi olmamali
        // en fazla 12 karakter olmalı

        Scanner oku = new Scanner(System.in);
        System.out.print("yeni bir password giriniz =");
        String pass = oku.nextLine();

        if (pass.length() >=8 && pass.length() <=12 && pass.contains("pass") == false) {
            System.out.println("uygundur");
        }
        else {
            System.out.println("uygun degildir");
        }

    }
}
