import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};
        for (int i = 0; i < array.length; i++) {
            int minTemp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    minTemp = array[j];
                    array[j] = array[i];
                    array[i] = minTemp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
