package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static int maxNumber(int number1, int number2, int number3) {
        int max = number1;
        if (number1 > number2) {
            if (number1 > number3){
                max = number1;
            } else {
                max = number3;
            }
        } else {
            if (number2 > number3) {
                max = number2;
            } else {
                max = number3;
            }
        }
        System.out.printf("Самое большое число - %d\n", max);
        return max;
    }
}