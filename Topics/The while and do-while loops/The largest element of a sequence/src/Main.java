import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = -1;
        while (true) {
            int counter = scanner.nextInt();
            if (counter > max) {
                max = counter;
            }
            if (counter == 0) {
                System.out.println(max);
                break;
            }
        }
    }
}