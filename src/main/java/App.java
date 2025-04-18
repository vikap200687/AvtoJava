public class App {
    public static void main(String[] args ) {
        org.example.App.maxNumber(40000, 1000, 60);
    }

    public static void findMaxElement(int num1, int num2, int num3) {
        int maxnumber = 0;
        //если elem1 меньше elem2
        if (num1 < num2) {
            //то elem2 - max
            maxnumber = num2;
        }
        if (num2 < num3) {
            maxnumber = num3;
        }
        System.out.println( "Max number = " + maxnumber );
    }

    public static void Calculator(String[] args) {
        Calculator calculator = new Calculator();

        double a = 10;
        double b = 5;

        System.out.println("Сложение: " + calculator.add(a, b));
        System.out.println("Вычитание: " + calculator.subtract(a, b));
        System.out.println("Умножение: " + calculator.multiply(a, b));
        System.out.println("Деление: " + calculator.divide(a, b));
    }

    public static class Calculator {

        // Метод для сложения
        public double add(double a, double b) {
            return a + b;
        }

        // Метод для вычитания
        public double subtract(double a, double b) {
            return a - b;
        }

        // Метод для умножения
        public double multiply(double a, double b) {
            return a * b;
        }

        // Метод для деления
        public static double divide(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Деление на ноль недопустимо!");
            }
            return a / b;
        }
    }}


