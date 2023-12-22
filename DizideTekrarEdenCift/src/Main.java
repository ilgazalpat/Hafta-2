import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for(int i: arr) {
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = { 7, 2, 5, 5, 4, 4, 2, 9, 11, 12, 12, 5};
        int[] duplicate = new int [list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length; j++) {
                if(list[i] == list[j] && list[i] % 2 == 0){
                    if(!isFind(duplicate, list[i])) {
                        duplicate [startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Tekrar eden çift sayılar : ");
        for(int value: duplicate){
            if (value != 0) {
                System.out.println(value);

            }
        }
    }
}