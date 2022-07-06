package Homework._05_18;

public class Soru5 {
    public static void main(String[] args) {

        int [] array = {5,6,8,12,14,19};
        int total = 0;
        for ( int i =0;i< array.length;i++){
            if(array[i]%2==1)
                array[i] = -array[i];
            total=total+array[i];
        }
        System.out.println("total = " + total);

    }
}
