package Gun08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen bir passwordun sizin bildiginiz bir kelime ile es olup olmadigini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Password =");
        String check = oku.nextLine();

        Boolean cevap = check.equals("bayrak");
        System.out.println("cevap = " + cevap);



    }
}
