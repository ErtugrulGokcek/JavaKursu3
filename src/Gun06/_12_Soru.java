package Gun06;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        // girilen bir string de bosluk olup olmadigini bulunuz

        Scanner oku=new Scanner(System.in);

        System.out.print("String Giriniz=");
        
        String bosluk = oku.nextLine();

        System.out.println("Bosluk var mi = " + bosluk.contains(" "));
        
        
    }
}
