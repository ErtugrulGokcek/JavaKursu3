package Homework._05_05;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir kelime giriniz =");
        String kelime = oku.nextLine();
        
        String lower = kelime.toLowerCase();
        boolean varMi = kelime.contains("b");

        System.out.println("varMi = " + varMi);
        
        
    }
}
