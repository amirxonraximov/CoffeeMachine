import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }
        var maxSequence = 1;
        var counter = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                counter++;
            } else {
                maxSequence = Math.max(counter, maxSequence);
                counter = 1;
            }
        }
        maxSequence = Math.max(counter, maxSequence);
        System.out.println(maxSequence);
    }
}