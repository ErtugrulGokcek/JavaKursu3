package Homework._05_18;

public class Soru4 {
    public static void main(String[] args) {
        int[] array = {15, 25, 22, 18, 30};
        int[] array2 = new int[4];
        int enb = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > enb)
                enb = array[i];
        }
        int enb2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == enb) continue;
            else array2[i] = array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > enb2) {
                enb2 = array2[i];
            }
        }
        System.out.println("enb = " + enb);
        System.out.println("enb2 = " + enb2);
    }
}


