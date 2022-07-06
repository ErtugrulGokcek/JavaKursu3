package Homework._05_11;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("please enter the amount =");
        String amount = oku.nextLine();

        if (amount.contains("€")){
            System.out.println("This is Euro");
        } else if (amount.contains("$")) {
            System.out.println("This is Dolar");
        }else {
            System.out.println("No Money");
        }

    }
}
