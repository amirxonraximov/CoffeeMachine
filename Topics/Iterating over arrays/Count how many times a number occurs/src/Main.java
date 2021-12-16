import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }
        var target = scanner.nextInt();
        var counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) counter++;
        }

        System.out.println(counter);
    }
}