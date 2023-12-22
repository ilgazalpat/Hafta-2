
public class Main {
    public static void main(String[] args) {
        int[] list = {8, 14, 5, 9, 4, 2, 11};
        double harmonicSum = 0.0;
        for (int i = 0; i < list.length; i++) {
           harmonicSum += 1.0 / list[i];
        }
        double harmonicAvarage = list.length / harmonicSum;
        System.out.println("Dizinin harmonik ortalaması : " + harmonicAvarage);

    }
}