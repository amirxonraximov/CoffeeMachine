import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, a, b;
        h = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        var mod = (h - b) % (a - b);
        if (mod == 0)
            System.out.println((h - b) / (a - b));
        else
            System.out.println(((h - b) / (a - b)) + 1);

    }
}