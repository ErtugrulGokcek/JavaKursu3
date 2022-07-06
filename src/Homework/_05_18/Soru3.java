package Homework._05_18;

public class Soru3 {
    public static void main(String[] args) {

        int enk=Integer.MAX_VALUE;
        int [] dizi = {14 , 19 , 5 , 21};

        for (int i=0; i< dizi.length;i++){
            if (dizi[i]<enk)
                enk=dizi[i];
        }
        System.out.println("enk = " + enk);
    }
}
