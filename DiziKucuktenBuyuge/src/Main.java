import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz : ");
        int boyut = input.nextInt();

        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = input.nextInt();
        }

        Arrays.sort(dizi);

        System.out.println("Sıralama : ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }

        input.close();
    }
}