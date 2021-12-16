import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapeOfRoom = scanner.nextLine();
        switch (shapeOfRoom) {
            case "triangle":
                Double a = scanner.nextDouble();
                Double b = scanner.nextDouble();
                Double c = scanner.nextDouble();
                Double p = (a + b + c) / 2;
                Double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            case "rectangle":
                Double x = scanner.nextDouble();
                Double y = scanner.nextDouble();
                System.out.println(x * y);
                break;
            case "circle":
                Double r = scanner.nextDouble();
                System.out.println(3.14  * r * r);
                break;
        }
    }
}