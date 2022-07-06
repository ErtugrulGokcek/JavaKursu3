package Homework._04_29;

import java.util.Scanner;

public class _29Apr_7 {
    public static void main(String[] args) {
        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Banka Hesabınız Var mı?=");

        Boolean hesap=okuyucu.nextBoolean();

        System.out.println("hesap = " + hesap);
    }
}
