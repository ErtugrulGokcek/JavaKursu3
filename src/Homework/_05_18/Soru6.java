package Homework._05_18;

import java.util.Arrays;

public class Soru6 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4};
        int [] array2 =new int[2];


            array2[0]=array[0];
            array2[1]=array[array.length-1];

        System.out.println("array2 = " + Arrays.toString(array2));
    }

}
