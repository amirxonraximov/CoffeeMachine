import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }
        var counter = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] == numbers[i + 1] - 1 && numbers[i + 1] == numbers[i + 2] - 1) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}