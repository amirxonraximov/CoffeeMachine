import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var sum = 0;
        while (true) {
            var temp = scanner.nextInt();
            if (temp == 0) {
                break;
            }
            sum += temp;
            if (sum >= 1000) {
                break;
            }
        }

        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }

    }
}