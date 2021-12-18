import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cupsNum = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean condition1 = cupsNum >= 10 && cupsNum <= 20 && !isWeekend;
        boolean condition2 = cupsNum >= 15 && cupsNum <= 25 && isWeekend;
        boolean partySucc = condition1 || condition2;

        System.out.println(partySucc);
    }
}