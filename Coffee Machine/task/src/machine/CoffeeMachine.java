package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need > ");
        int n = g.nextInt();
        System.out.println("For " + n + " cups of coffee you will need:");
        System.out.println(n * 200 + " ml of water");
        System.out.println(n * 50 + " mlof milk");
        System.out.println(n * 15 + " g of coffee beans");
    }
}
