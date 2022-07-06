package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // kullanicidan 5 elemanli bir diziyi doldurduktan sonra dizinin en kucuk, en buyuk elemanını ve ortalamasini bulduktan sonra
        // bu dizinin bütün elemanlarinin karelerini yeni bir diziye atayiniz
        // bu dizininide en kucuk, en buyuk ve ortalamasini aliniz
        Scanner oku = new Scanner(System.in);
        int [] array = new int[5];
        for (int i =0;i< array.length;i++){
            System.out.print(i+1+". sayiyi giriniz = ");
            array[i]= oku.nextInt();
        }
        enKucukYaz(array);
        enBucukYaz(array);
        ortalamaYaz(array);

        // 2. kisim

        int [] array2=new int[5];
        for (int i =0;i< array.length;i++){
            array2[i]=array[i]*array[i];
        }
        enKucukYaz(array2);
        enBucukYaz(array2);
        ortalamaYaz(array2);
    }
    public static void enKucukYaz (int [] array){
        Arrays.sort(array);
        System.out.println("en kucuk = "+ array[0]);
    }
    public static void enBucukYaz (int [] array){
        Arrays.sort(array);
        System.out.println("en buyuk = " + array[array.length-1]);
    }
    public static void ortalamaYaz (int [] array){
        int toplam=0;
        for (int i =0;i< array.length;i++){
            toplam+=array[i];
        }
        int ort=toplam/ array.length;
        System.out.println("ort = " + ort);
    }
}
