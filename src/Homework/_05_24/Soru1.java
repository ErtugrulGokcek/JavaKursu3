package Homework._05_24;

public class Soru1 {
    public static void main(String[] args) {

        System.out.println("randomBul() = " + randomBul());

    }
    public static int randomBul(){
        double s1= Math.random();
        int max = (int)(Integer.MAX_VALUE *s1);
        return  max;
    }

}
