package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            var option = scanner.nextLine();
            switch (option) {
                case "buy":
                    buy(scanner);
                    break;
                case "fill":
                    fill(scanner);
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    return;
            }
        }
    }

    private static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    private static void buy(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        switch (scanner.nextLine()) {
            case "1":
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    disposableCups--;
                    water -= 250;
                    coffeeBeans -= 16;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2":
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough coffee milk!");
                } else {
                    disposableCups--;
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough coffee milk!");
                } else {
                    disposableCups--;
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
        }
    }

    private static void fill(Scanner scanner) {
        System.out.println("Write how many ml of water you want to add:");
        water += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk you want to add:");
        milk += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee you want to add:");
        disposableCups += Integer.parseInt(scanner.nextLine());
    }

    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}


