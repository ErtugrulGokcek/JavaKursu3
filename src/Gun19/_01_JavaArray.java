package Gun19;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 100 elemanli bir diziye random (0-100) doldurduktan sonra sadece tek eleamnli olanlari baska bir diziye atayiniz

        int [] array1 = new int[100];
        int [] array2 = new int[100];
        for (int i=0;i< array1.length;i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        int j=0;
        for (int i=0;i< array1.length;i++) {
                if (array1[i] %2==1)
                    array2[j] = array1[i];
                j++;
            }
            System.out.println("array2 = " + Arrays.toString(array2));



    }
}
