public class Task {

    //сравнить два числа и вывести большее
    public static void findMaxNumber() {
        int number1 = 70;
        int number2 = 1000;
        int number3 = 100;
        int maxnumber = 0;
        //если elem1 меньше elem2
        if (number1 < number2) {
            //то elem2 - max
            maxnumber = number2;
        }
        if (number2 < number3) {
            maxnumber = number3;
        }
        System.out.println( "Max number = " + maxnumber );
    }

    public static void maxNumber(){
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int max  = number1;

        if (number1 > number2) {
            max = number1;
        }
        else  {
            max = number2;
        }
    }
}
