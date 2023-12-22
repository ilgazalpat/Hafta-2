import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Taban değerini giriniz: ");
                int taban = input.nextInt();

                System.out.print("Üs değerini giriniz: ");
                int us = input.nextInt();

                input.close();

                int result = usAl(taban, us);
                System.out.println("Sonuç : " + result);
            }

            static int usAl(int taban, int us) {
                if (us == 0) {
                    return 1;
                }
                return taban * usAl(taban, us - 1);

    }
}