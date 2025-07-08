import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Arrays {
    public static void main (String[] args){
        System.out.println("Задача 1 ");
        int [] arrNumbers = new int[5];
        System.out.println(arrNumbers.length);

        System.out.println("Задача 2 ");
        String[] arrNames = {"Катя", "Витя", "Максим"};
        int element = arrNames.length - 1;
        System.out.println(arrNames[element]);
        System.out.println(element);

        System.out.println("Задача 3 ");
        int[] arrNumberss = {10, 2, 98, 54};
        java.util.Arrays.sort(arrNumbers);
        for (int values : arrNumberss) {
            System.out.println(values + ", ");
        }

        System.out.println("Задача 4 ");
        int [] arrNum = {1, 10, 34};
        String arrNumbers1 = java.util.Arrays.toString(arrNum);
        System.out.println(arrNumbers1);

        System.out.println("Задача 5 ");
        int [] arrNumbers2 = {15, 46,76,66};
        int [] arrNumbersDupl = java.util.Arrays.copyOf(arrNumbers2, arrNumbers2.length);
        boolean isEqual = java.util.Arrays.equals(arrNumbers2,arrNumbersDupl);
        System.out.println(java.util.Arrays.toString(arrNumbersDupl));
        System.out.println (isEqual);

        System.out.println("Задача 6 ");
        int [] arrNumbers3 = {34,66,77};
        int sum = arrNumbers[0] + arrNumbers[1];
        arrNumbers[arrNumbers.length - 1] = sum;
        System.out.println("Первое число: " + arrNumbers[0]);
        System.out.println("Второе число: " + arrNumbers[1]);
        System.out.println("Последнее число (сумма первого и второго): " + arrNumbers[2]);
    }
   }


