import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in); // 1
        final int a = 0;                                    // 2
        final int b;            // 3
        b = scanner.nextInt() + a;
        int c = 0;                                // 4
        c = b;                                          // 5
        System.out.println(c + 1);
    }
}