

public class App {
    public static void main( String[] args ) {
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
}
