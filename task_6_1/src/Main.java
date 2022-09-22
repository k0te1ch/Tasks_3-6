import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static double MagicBox(int type, double x, double n, double e){
        double sum = 0;
        if (type == 3) return Math.log(1-x);
        for (double i = 1; i <= n; i++){
            if (type == 2) e = e / 10;
            if (type == 0 || ((type == 1 || type == 2) && Math.abs(Math.pow(x, i) / i) > e)) sum = sum - Math.pow(x, i) / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число x (-1; 1): ");
        double x = scan.nextDouble();
        System.out.print("Введите число n: ");
        double n = scan.nextDouble();
        System.out.print("Введите число e: ");
        double e = scan.nextDouble();
        scan.close();
        System.out.println(MagicBox(0, x, n, e));
        System.out.println(MagicBox(1, x, n, e));
        System.out.println(MagicBox(2, x, n, e));
        System.out.println(MagicBox(3, x, n, e));
    }
}