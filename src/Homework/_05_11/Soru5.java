package Homework._05_11;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Please Enter Your Quiz Score = ");
        int quiz = oku.nextInt();
        System.out.print("Please Enter Your MidTerm Score = ");
        int midTerm = oku.nextInt();
        System.out.print("Please Enter Your Final Score = ");
        int _final = oku.nextInt();

        if ((quiz+midTerm+_final)/3 >= 90) {
            System.out.println("Your Grade is A");
        } else if ((quiz+midTerm+_final)/3 >= 70) {
            System.out.println("Your Grade is B");
        } else if ((quiz+midTerm+_final)/3 >= 50) {
            System.out.println("Your Grade is C");
        }else {
            System.out.println("Your Grade is F");
        }


    }
}
