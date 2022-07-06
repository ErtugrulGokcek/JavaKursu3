package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanicdan alacaginiz 6 elemanli bir dizinin
        // sadece tek sayi olan elemalarini ayri diziye atayarak yazdiriniz

        Scanner oku = new Scanner(System.in);

        int [] dizi = new int[6];
        for (int i=0;i< dizi.length;i++){
            System.out.print("Sayi = ");
            dizi[i]= oku.nextInt();

        }
        ArrayList<Integer> donenTekler=tekElemanlariAta(dizi);
        System.out.println("donenTekler = " + donenTekler);

    }
    public static ArrayList<Integer> tekElemanlariAta (int[]dizi){
        ArrayList<Integer> tekler = new ArrayList<>();
        for (int i=0;i< dizi.length; i++)
            if (dizi[i] % 2 == 1)
                tekler.add(dizi[i]);

            return tekler;
        }
    }


