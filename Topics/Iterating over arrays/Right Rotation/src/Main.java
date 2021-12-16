import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int[] input = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            input[i] = Integer.parseInt(numbers[i]);
        }
        var result = rightRotate(input, scanner.nextInt() % input.length);
        for (int j : result) {
            System.out.print(j + " ");
        }

    }

    private static int[] rightRotate(int[] inputArray, int n) {
        int temp;

        for (int i = 1; i <= n; i++) {
            temp = inputArray[inputArray.length - 1];
            System.arraycopy(inputArray, 0, inputArray, 1, inputArray.length - 1);
            inputArray[0] = temp;
        }
        return inputArray;
    }
}