package Gun20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();
        ozelMerhabaYaz("ismet");
        ozelMerhabaYaz("Mehmet");
        ozelMerhabaYaz("Melike");


    }

    public static void merhabaYaz () {

        System.out.println("Merhaba");
    }
    public static void ozelMerhabaYaz (String isim) {
        System.out.println("Merhaba " +isim + " hosgeldiniz"  );
    }


}
