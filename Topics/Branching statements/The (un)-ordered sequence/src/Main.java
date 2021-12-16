import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = -2, ascPairs = 0, descPairs = 0;
        boolean isOrder = false;

        int temp = scanner.nextInt();
        countOfNumbers++;
        int first = temp;

        while (true) {
            temp = scanner.nextInt();
            countOfNumbers++;
            if (temp == first) {
                ascPairs++;
                descPairs++;
            }
            else if (temp > first && temp != 0) {
                first = temp;
                ascPairs++;
                isOrder = true;
            }
            else if (temp != 0){
                first = temp;
                descPairs++;
                isOrder = true;
            }
            else {
                break;
            }
        }
        scanner.close();

        System.out.println((countOfNumbers == ascPairs && isOrder)
                || (countOfNumbers == descPairs && isOrder)
                || (countOfNumbers == 0));
        // last string is needed if validator considers
        // one number like an ordered sequence
    }
}