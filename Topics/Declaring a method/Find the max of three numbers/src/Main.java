import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        if ((a + b + c) / 3.0 <= a){
            return 1;
        }
        if ((a + b + c) / 3.0 <= b){
            return 2;
        }
        if ((a + b + c) / 3.0 <= c){
            return 3;
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}