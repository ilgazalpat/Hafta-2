import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] list = {24, 13, -4, 117, -6, 8, 2};
        int sayi = 5;

        Arrays.sort(list);
        int yakinMin = list[0];
        int yakinMax = list[list.length - 1];
        for (int eleman : list) {
            if (eleman <= sayi) {
                yakinMin = eleman;
            }
            if (eleman >= sayi) {
                yakinMax = eleman;
                break;
            }
        }

        System.out.println("Sayıdan küçük en yakın sayı: " + yakinMin);
        System.out.println("Sayıdan büyük en yakın sayı: " + yakinMax);
    }
}