package Gun18;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 elemanli bir diziyi random olarak 100 e kadar olan sayilarla doldurunuz
        // sonrasinda en buyuk elemani ve indexini bulunuz

        int dizi[] = new int[100];
        int enb = 0;
        int enbIndex =0;
        for (int i = 0; i< dizi.length;i++) {
            dizi[i]= (int) (Math.random()*100);
            if (dizi[i]>enb) {
                enb = dizi[i];
                enbIndex = i;
            }
        }
        System.out.println("enb = " + enb);
        System.out.println("enbIndex = " + enbIndex);


    }
}
