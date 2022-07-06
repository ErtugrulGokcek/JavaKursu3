package Homework._05_18;

public class Soru10 {
    public static void main(String[] args) {
        int [] array ={25,30,30,35,100};
        int toplam=0;

        for (int i=0;i< array.length;i++){
            toplam=toplam+array[i];
        }
        System.out.println("toplam = " + toplam);

    }
}
