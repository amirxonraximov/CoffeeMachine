import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNum = scanner.nextInt();

        int counter = 0;

        for (int i = 1; i <= totalNum; i++) {
            for (int j = 1; j <= i; j++) {
                counter++;
                System.out.print(" " + i);
                if (counter == totalNum) return;
            }
        }
    }
}