import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < size; i++) {
            counter += scanner.nextInt();
        }
        System.out.println(counter);

    }
}