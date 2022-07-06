package Gun05;

import java.util.Scanner;

public class _09_Ornek7 {
    public static void main(String[] args) {
        // Kullanicidan username ve pass girisini aliniz

        Scanner oku=new Scanner(System.in);

        System.out.print("Username Giriniz=");

        String username= oku.nextLine();

        System.out.print("Password Giriniz=");

        String password= oku.nextLine();

        System.out.println("username = " + username);
        System.out.println("password = " + password);



    }
}
