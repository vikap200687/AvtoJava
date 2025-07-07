import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 3 ");
        int[] arr = {3, 9, 1, 7, 5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];}
        }
        System.out.println("Максимальное число = " + max);

        System.out.println("Задача 5 ");
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i] + " ");
        }

        System.out.println("Задача 6 ");
        int[] newnums = {2, 5, 8, 3, 10, 7};
        int count = 0;
        for (int i = 0; i < newnums.length; i++){
            if (newnums [i] % 2 == 0) {
                count ++;
            }
        }
        System.out.println("Количество четных чисел = " + count);

        System.out.println("Задача 7 ");
        double[] temps = {18.5, 20.0, 22.3, 19.8};
        double sum = 0;
        for (double temp : temps) {
            sum += temp;
        }
        double average = sum / temps.length;

        System.out.println("Среднее значение: " + average);

        System.out.println("Задача 8 ");
        String[] names = {"Анна", "Борис", "Катя"};
        String target = "Катя";

        if (Arrays.asList(names).contains(target)) {
            System.out.println("Найдено!");
        } else {
            System.out.println("Не найдено.");
        }
    }

}







