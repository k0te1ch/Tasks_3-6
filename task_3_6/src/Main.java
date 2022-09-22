import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String printColourForPointTest(double x, double y, SimpleColour colour){
        return String.format("(%f, %f) -> %s | %s", x, y, Program.getColour(x, y), colour);
    }
    public static String printColourForPoint(double x, double y){
        return String.format("(%f, %f) -> %s", x, y, Program.getColour(x, y));
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Tests:");
        System.out.println(printColourForPointTest(10, -0.1, SimpleColour.WHITE));
        System.out.println(printColourForPointTest(6, 1, SimpleColour.WHITE));
        System.out.println(printColourForPointTest(3.1,-1.1, SimpleColour.WHITE));

        System.out.println(printColourForPointTest(0, -4, SimpleColour.YELLOW));
        System.out.println(printColourForPointTest(5, 0, SimpleColour.YELLOW));
        System.out.println(printColourForPointTest(5, -1, SimpleColour.YELLOW));
        System.out.println(printColourForPointTest(3.5, -0.5, SimpleColour.YELLOW));
        System.out.println(printColourForPointTest(4.5, 5, SimpleColour.YELLOW));

        System.out.println(printColourForPointTest(0, 0, SimpleColour.GREEN));
        System.out.println(printColourForPointTest(-1,-1, SimpleColour.GREEN));
        System.out.println(printColourForPointTest(2,-1, SimpleColour.GREEN));
        System.out.println(printColourForPointTest(2.5, -1.3, SimpleColour.GREEN));

        System.out.println(printColourForPointTest(2, 1, SimpleColour.GRAY));
        System.out.println(printColourForPointTest(3, 10, SimpleColour.GRAY));

        System.out.println(printColourForPointTest(2, -2, SimpleColour.ORANGE));
        System.out.println(printColourForPointTest(0, 8.5, SimpleColour.ORANGE));
        System.out.println(printColourForPointTest(2.5, 8.5, SimpleColour.ORANGE));
        System.out.println(printColourForPointTest(3.5, 0.5, SimpleColour.ORANGE));
        System.out.println(printColourForPointTest(2.9, 1.9, SimpleColour.ORANGE));
        System.out.println(printColourForPointTest(-6, 0, SimpleColour.ORANGE));
        System.out.println(printColourForPointTest(0, -8, SimpleColour.ORANGE));
        System.out.println(printColourForPointTest(8, -8, SimpleColour.ORANGE));
        System.out.println(printColourForPointTest(-1, 10, SimpleColour.ORANGE));

        System.out.println(printColourForPointTest(2, 5, SimpleColour.BLUE));

        System.out.print("Input X: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.print("Input Y: ");
        double y = scan.nextDouble();
        scan.close();
        System.out.println(printColourForPoint(x, y));
    }
}