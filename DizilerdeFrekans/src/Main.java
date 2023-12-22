import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz : ");
        int boyut = input.nextInt();

        int[] dizi = new int[boyut];
        System.out.println("Dizi elemanlarını giriniz :");

        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = input.nextInt();
        }

        for (int i = 0; i < boyut; i++) {
            int eleman = dizi[i];
            int frekans = 1;

            for (int j = i + 1; j < boyut; j++) {
                if (dizi[j] == eleman) {
                    frekans++;
                    dizi[j] = Integer.MIN_VALUE;
                }
            }

            if (eleman != Integer.MIN_VALUE) {
                System.out.println(eleman + " sayısı  " + frekans + " kere tekrar etti");
            }
        }

        input.close();
    }
}