import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }
        var target = scanner.nextInt();
        for (int number : numbers) {
            if (target == number) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}