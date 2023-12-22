import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını giriniz : ");
        int satirSayisi = input.nextInt();

        System.out.print("Matrisin sütun sayısını giriniz : ");
        int sutunSayisi = input.nextInt();

        int[][] matris = new int[satirSayisi][sutunSayisi];
        System.out.println("Matris elemanlarını giriniz : ");

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("Eleman [" + (i + 1) + "][" + (j + 1) + "]: ");
                matris[i][j] = input.nextInt();
            }
        }

        int[][] transpozeMatris = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozeMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        matrisiYazdir(matris);

        System.out.println("Transpoze Matris:");
        matrisiYazdir(transpozeMatris);

        input.close();
    }

    private static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}