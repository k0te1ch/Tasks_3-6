public class Main {
    public static void magicBox(int w, int h){
        boolean left = true;
        int cnt = -1;
        int n = 1;
        for (int i = 1; i <= h; i++){
            for (int z = 1; z <= w; z++){
                if (i == 1 || i == h) {
                    if (z == 1 || z == w) System.out.print("+");
                    else System.out.print("-");
                } else {
                    if (z == 1 || z == w) System.out.print("|");
                    else {
                        if (left && z - 1 <= (w - 2) / 2) System.out.print("*");
                        else if (!left && z - 1 > (w - 2) / 2) System.out.print("*");
                        else System.out.print(" ");
                    }
                }
            }
            System.out.println();
            cnt = cnt + 1;
            if (cnt == n) {
                if (!left) n = n + 1;
                cnt = 0;
                left = !left;
            }
        }
    }
    public static void main(String[] args) {
        magicBox(12, 23);
    }
}