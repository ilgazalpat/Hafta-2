import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        scanner.close();

        recursiveIslem(sayi, sayi, true);
    }

    static void recursiveIslem(int sayi, int baslangic, boolean ilkAdim) {
        if (ilkAdim) {
            System.out.print(sayi + " ");
        }

        if (sayi <= 0) {
            recursiveEkle(sayi + 5, baslangic);
        } else {
            System.out.print((sayi - 5) + " ");
            recursiveIslem(sayi - 5, baslangic, false);
        }
    }

    static void recursiveEkle(int sayi, int baslangic) {
        if (baslangic >= sayi) {
            System.out.print(sayi + " ");
            System.out.println();
        } else {
            System.out.print(sayi + " ");
            recursiveEkle(sayi + 5, baslangic);
        }
    }
}