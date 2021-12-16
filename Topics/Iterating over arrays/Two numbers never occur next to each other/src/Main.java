import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == a && array[i + 1] == b || array[i] == b && array[i + 1] == a) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}