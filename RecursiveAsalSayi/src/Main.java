import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        input.close();

        if (sayi < 2) {
            System.out.println(" sayısı ASAL değildir !");
        } else {
            if (asalKontrol(sayi, sayi / 2)) {
                System.out.println(sayi + " sayısı ASALDIR !");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir !");
            }
        }
    }

    static boolean asalKontrol(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        } else {
            if (sayi % bolen == 0) {
                return false;
            } else {
                return asalKontrol(sayi, bolen - 1);
            }
        }
    }
}