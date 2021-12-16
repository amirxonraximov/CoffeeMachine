import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -1;

        while (n > 0){
            int number = scanner.nextInt();
            if (number % 4 == 0 && max < number) {
                max = number;
            }
            n--;
        }
        System.out.println(max);
    }
}