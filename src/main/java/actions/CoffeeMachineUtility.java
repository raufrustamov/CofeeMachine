package actions;

import enums.Messages;
import enums.ResidueInMachine;

import static actions.BuyCoffee.*;

public class CoffeeMachineUtility {
    public static void printCapacity() {
        System.out.println("The coffee machine has:\n"
                + ResidueInMachine.WATER.count + " ml of water\n"
                + ResidueInMachine.MILK.count + " ml of milk\n"
                + ResidueInMachine.BEANS.count + " g of coffee beans\n"
                + ResidueInMachine.CUPS.count + " disposable cups\n"
                + "$" + ResidueInMachine.MONEY.count + " of money\n");
    }

    public static void selectCoffeeType(String typeOfCoffee) {
        switch (typeOfCoffee) {
            case "1":
                buyEspresso();
                break;
            case "2":
                buyLatte();
                break;
            case "3":
                buyCappuccino();
                break;
            case "back":
                break;
        }
    }

    public static void addIngredients(int water, int milk, int beans, int cups) {
        ResidueInMachine.WATER.count += water;
        ResidueInMachine.MILK.count += milk;
        ResidueInMachine.BEANS.count += beans;
        ResidueInMachine.CUPS.count += cups;
    }

    static void printSuccessMessage() {
        System.out.println(Messages.SUCCESS.msg);
        System.out.println();
    }

    public static class Withdrawal {
        public static void withdrawalMoney() {
            System.out.println("I gave you $" + ResidueInMachine.MONEY.count);
            ResidueInMachine.MONEY.count = 0;
            System.out.println();

        }
    }
}
