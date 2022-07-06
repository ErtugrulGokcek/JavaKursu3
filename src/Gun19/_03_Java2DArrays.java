package Gun19;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ders , 3 ogrencilik bilgileri tutacak bir tablo lazim

        int[][] table1 = new int[2][3];
        int[][] table2 = {{23, 44, 55}, {45, 66, 77}};

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.println("sutun = " + table2[satir][sutun]);
            }
        }
        int toplam = 0;
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                toplam = toplam + table2[satir][sutun];
            }
            System.out.println("toplam = " + toplam);
        }

    }
}