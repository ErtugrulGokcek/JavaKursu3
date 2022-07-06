package Homework._05_18;

public class Soru2 {
    public static void main(String[] args) {

        int [] dizi = {12,2,5,15,8};
        int enb=0;
        for (int i = 0 ;i< dizi.length;i++){
            if(dizi[i]>enb)
                enb=dizi[i];
        }
        System.out.println("enb = " + enb);
    }
}
