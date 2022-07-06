package Homework._05_18;

public class Soru7 {
    public static void main(String[] args) {
        int [] array = {12, 14 , 21 ,23 , 10 ,4};
        double toplam=0;

        for (int i =0 ;i< array.length;i++){
            toplam=toplam+array[i];

        }
        System.out.println("ortalama = " + (toplam/ (array.length-1)));

    }
}
