import com.sun.tools.javac.util.Assert;

public class App {
    public static void main( String[] args ) {
        int x = 100;
        org.example.App.maxNumber(40, x, 60);
    }

    public static void findMaxElement(int elem1, int elem2) {
        int max = 0;
        //если elem1 меньше elem2
        if (elem1 < elem2) {
            //то elem2 - max
            max = elem2;
        } else {
            max = elem1;
            //иначе elem1 - max
        }
        System.out.println( "Max = " + (Math.max(elem1, elem2)) );

        System.out.println( "Max = " + max );
    }
}
