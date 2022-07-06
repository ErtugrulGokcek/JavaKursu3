package Gun18;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1 çift olanlara 2 atayınız  yazdırınız.

        int array[] = new int[50];

        for (int i =0;i< array.length;i++){

            array[i]= (int) (Math.random()*10);
        }
        for (int i =0;i< array.length;i++){
            if (i%2==1){
                System.out.println("1");
            }else
                System.out.println("2");
        }

    }

}
