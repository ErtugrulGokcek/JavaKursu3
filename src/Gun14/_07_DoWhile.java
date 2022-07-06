package Gun14;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // Kullanicidan x girilene kadar ekrana program calisiyor yazan ve x girildiginde program bitti yazan programi yaziniz

        Scanner oku = new Scanner(System.in);

        String check = "";
        do {
            System.out.print("continue? =");
            check = oku.nextLine();
            System.out.println("program calisiyor");
        } while (!check.equalsIgnoreCase("x"));

        System.out.println("program bitti");

    }

}
