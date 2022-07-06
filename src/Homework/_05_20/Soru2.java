package Homework._05_20;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        String[][] array = new String[2][3];
        int [][] array2=new int[2][3];
        int toplam = 0;
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("tutar ve kuru giriniz =");
                array[i][j] = oku.nextLine();
                array [i][j] = array[i][j].replaceAll("\\$", "");

                array2 [i][j] = Integer.parseInt(array[i][j]);
                System.out.println("array2 = " + array2[i][j]);
                System.out.println(toplam);
            }

        }


    }
}
