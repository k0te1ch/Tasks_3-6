import java.util.Scanner;

public class Main {
    public static int getFactorial(double f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static double magicBox(int n){
        double sum = 0;
        for (double i = 1; i <= n; i++){
            sum = sum + Math.pow(-1, i) * (i+1) / getFactorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Введите число N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(String.format("Ответ: %f", magicBox(n)));
    }
}