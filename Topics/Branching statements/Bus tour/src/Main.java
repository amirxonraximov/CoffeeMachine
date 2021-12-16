import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridge = scanner.nextInt();
        int crashBridge = 0;
        int counter = 0;

        for (int i = 0; i < numberOfBridge; i++) {
            var temp = scanner.nextInt();
            counter++;
            if (temp <= busHeight && crashBridge == 0) {
                crashBridge = counter;
            }
        }
        if (crashBridge == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crashBridge);
        }
    }
}