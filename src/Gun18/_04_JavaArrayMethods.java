package Gun18;

import java.util.Arrays;

public class _04_JavaArrayMethods {
    public static void main(String[] args) {
        //Arrays.toString (dizi) diziyi string olarak direk yazdirir

        String [] isimler = {"ahmet", "melike", "sumeyra","mert", "inanc"};

        System.out.println("isimler = " + Arrays.toString(isimler));

        // Arrays.sort(isimler) diziyi siralar

        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

        // diziler esit mi?

        int[] a = {1,8,3,54};
        int[] b = {1,8,3,54};
        int[] c = {1,8,3,55};

        System.out.println("check = " + Arrays.equals(a,b));
        System.out.println("check = " + Arrays.equals(a,c));

        // Arrays.fill butun kutucuklara 7 yi atar
        Arrays.fill(c,7);
        System.out.println("c = " + Arrays.toString(c));

        // Arrays.binarySearch -> aranan elemanin indexini verir ama ancak sirali olursa
        int [] rakamlar = {2,7,4,6,23,5,6};
        System.out.println("rakamlar = " + Arrays.binarySearch(rakamlar,5));
        Arrays.sort(rakamlar);
        System.out.println("rakamlar = " + Arrays.binarySearch(rakamlar,5));



    }
}
