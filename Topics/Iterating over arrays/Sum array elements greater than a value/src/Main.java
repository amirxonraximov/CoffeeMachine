import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int n = in.nextInt();

        for (int value : array) {
            if (value > n) {
                sum += value;
            }
        }
        System.out.println(sum);

    }
}