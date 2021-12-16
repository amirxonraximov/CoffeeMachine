import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int counter = 1;
        long fact = 1;
        while (true) {
            fact *= counter;
            if (fact > m) {
                System.out.println(counter);
                break;
            }
            counter++;
        }
    }
}