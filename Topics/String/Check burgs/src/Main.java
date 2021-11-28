import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        if (cityName.endsWith("burg")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}