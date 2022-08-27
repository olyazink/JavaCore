import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        //Date dat = new Date();
        int sum = 0;
        int min = 10000000;         //заведомо большое число
        int max = -10000000;        //заведомо маленькое число
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int dat = (int) Math.abs(System.nanoTime() % 10000);
                array[i][j] = dat / (dat % 5 + 1) / 100; //заполняем матрицу от 0 до 99
                sum += array[i][j]; //суммируем все значения

                //запоминаем минимальное значение
                if (array[i][j] <= min) {
                    min = array[i][j];
                }
                //запоминаем максимальное значение
                if (array[i][j] >= max) {
                    max = array[i][j];
                }
                //вывод матрицы
                System.out.print(array[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("Среднее значение: " + (sum / (array.length * array[0].length)));
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
}
