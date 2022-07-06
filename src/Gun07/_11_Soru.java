package Gun07;

public class _11_Soru {
    public static void main(String[] args) {
        // girilen bir stringdeki nokta sayısını bulunuz
        // 01.02.20 bu stringde kaç tane nokta vardır

        String text = "01.02.20";

        int first = text.length();

        String text2 = text.replace(".","");
        
        int second = text2.length();
        
        int noktaSayısı = first-second;

        System.out.println("noktaSayısı = " + noktaSayısı);


    }
}
