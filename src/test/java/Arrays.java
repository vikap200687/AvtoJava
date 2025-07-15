import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Arrays {
    public static void main (String[] args) {
        createArrayN();
        createArrStrings();
        sortArr();
        arrToString();
        copyArr();
        changeLastNum();
    }

        public static void createArrayN () {
            System.out.println("Задача 1 ");
            int[] arrNumbers = new int[5];
            System.out.println(STR."Длина массива = \{arrNumbers.length}");
            System.out.println();
        }

        public static void createArrStrings () {
            System.out.println("Задача 2 ");
            String[] arrNames = {"Катя", "Витя", "Максим"};
            int element = arrNames.length - 1;
            System.out.println("Название последнего элемента: " + arrNames[element]);
            System.out.println("Номер последнего элемента = " + element);
            System.out.println();
        }

        public static void sortArr () {
            System.out.println("Задача 3 ");
            int[] arrNumbers = {10, 2, 98, 54};
            java.util.Arrays.sort(arrNumbers);
            for (int i = 0; i < 3; i++) {
                System.out.print( arrNumbers[i] + ", " );
            }
            System.out.println(arrNumbers[3]);
            System.out.println();
        }

        public static void arrToString () {
            System.out.println("Задача 4 ");
            int[] arrNum = {1, 10, 34};
            String arrNumbers1 = java.util.Arrays.toString(arrNum);
            System.out.println("Массив : " + arrNumbers1);
            System.out.println();
        }

        public static void copyArr () {
            System.out.println("Задача 5 ");
            int[] arrNumbers2 = {15, 46, 76, 66};
            int[] arrNumbersDupl = java.util.Arrays.copyOf(arrNumbers2, arrNumbers2.length);
            boolean isEqual = java.util.Arrays.equals(arrNumbers2, arrNumbersDupl);
            System.out.println("Массив: " + java.util.Arrays.toString(arrNumbersDupl));
            System.out.println("Результат сравнения массивов: " + isEqual);
            System.out.println();
        }

        public static void changeLastNum () {
            System.out.println("Задача 6 ");
            int[] arrNumbers = {34, 66, 77};
            int sum = arrNumbers[0] + arrNumbers[1];
            arrNumbers[arrNumbers.length - 1] = sum;
            System.out.println(STR."Первое число: \{arrNumbers[0]}");
            System.out.println(STR."Второе число: \{arrNumbers[1]}");
            System.out.println(STR."Последнее число (сумма первого и второго): \{arrNumbers[2]}");
        }
    }
