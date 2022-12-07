package actions;

import java.util.Scanner;

import static actions.CoffeeMachineUtility.Withdrawal.withdrawalMoney;
import static actions.CoffeeMachineUtility.*;


public class StartMachine {
    static String action = "";

    public static void startCoffeeMachine(Scanner scanner) {
        while (!action.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = scanner.nextLine();
            System.out.println();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String typeOfCoffee = scanner.nextLine();
                    selectCoffeeType(typeOfCoffee);
                    break;
                case "fill":
                    System.out.println();
                    System.out.println("Write how many ml of water you want to add: ");
                    int addWater = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int addMilk = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int addBeans = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    System.out.println("Write how many disposable cups you want to add: ");
                    int addCups = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    addIngredients(addWater, addMilk, addBeans, addCups);
                    break;
                case "take":
                    withdrawalMoney();
                    break;
                case "remaining":
                    printCapacity();
                    break;
            }
        }
    }
}
