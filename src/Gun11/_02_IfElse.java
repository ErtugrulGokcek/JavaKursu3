package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // girilen vize (40%) ve final (60%) ortalamayi bul ort 60 dan buyukse gectiniz degilse butunlemeye kaldiniz yaz

        Scanner oku = new Scanner(System.in);
        System.out.print("Vize notunuzu girin =");
        int vize = oku.nextInt();

        System.out.print("Final notunuzu girin =");
        int _final = oku.nextInt();

        double ort = ((vize*0.4)+(_final*0.6));

        if (ort >=60) {
            System.out.println("gectiniz");
        }
        else {
            System.out.println("butunlemeye kaldiniz");
        }



    }
}
