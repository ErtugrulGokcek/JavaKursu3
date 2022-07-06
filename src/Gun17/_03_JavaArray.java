package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] dizi = new int[5];

        int [] dizi2 = {5,77,67,8,99,0,4,555}; // hem uzunlugu hem degerleri verildi

        String [] kelimeler = new String[5]; // 5 tane kelime saklayabilen bir dizi degiskeni
        Boolean [] dizi3 = new Boolean[5]; // 5 tane boolean saklayabilen bir dizi degiskeni
        Double [] oranlar = new Double[5]; // 5 tane double saklayabilen bir dizi degiskeni

        for (int i = 0;i<5;i++)
            System.out.println("dizi = " + dizi[i]);


    }
}
