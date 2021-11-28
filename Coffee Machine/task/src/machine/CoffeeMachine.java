package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, water, milk, coffeeBeans;
        System.out.println("Write how many ml of water the coffee machine has:");
        water = scanner.nextInt();
        System.out.println("> " + water);
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();
        System.out.println("> " + milk);
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeBeans = scanner.nextInt();
        System.out.println("> " + coffeeBeans);
        System.out.println("Write how many cups of coffee you will need:");
        n = scanner.nextInt();

//        Like in the previous stage, the coffee machine needs 200 ml
//        of water, 50 ml of milk, and 15 g of coffee beans to make
//        one cup of coffee.

        int maxCupWater = (water / 200);
        int maxCapMilk = (milk / 50);
        int maxCapCoffeeBeans = (coffeeBeans / 15);
        int minCup = Math.min(maxCapCoffeeBeans, Math.min(maxCapMilk, maxCupWater));

        if ((water - n * 200) >= 0 && (milk - n * 50) >= 0 && (coffeeBeans - n * 15) >= 0) {
            if (minCup == n)
                System.out.println("Yes, I can make that amount of coffee");
            else
                System.out.println("Yes, I can make that amount of coffee (and even " + (minCup - n) + " more than that)");
        } else {
            System.out.println("No, I can make only " + minCup + " cup(s) of coffee");
        }

    }
}
