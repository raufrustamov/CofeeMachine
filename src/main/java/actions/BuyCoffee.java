package actions;

import enums.CoffeeType;
import enums.Messages;
import enums.ResidueInMachine;

import static actions.CoffeeMachineUtility.printSuccessMessage;

public class BuyCoffee {


    public static void buyEspresso() {
        if (ResidueInMachine.WATER.count < CoffeeType.ESPRESSO.water) {
            System.out.println(Messages.WATER.msg);
        } else {
            ResidueInMachine.WATER.count -= CoffeeType.ESPRESSO.water;
            ResidueInMachine.BEANS.count -= CoffeeType.ESPRESSO.beans;
            ResidueInMachine.CUPS.count--;
            ResidueInMachine.MONEY.count += CoffeeType.ESPRESSO.price;
            printSuccessMessage();
        }
    }

    public static void buyLatte() {
        if (ResidueInMachine.WATER.count < CoffeeType.LATTE.water) {
            System.out.println(Messages.WATER.msg);
        }else {
            ResidueInMachine.WATER.count -= CoffeeType.LATTE.water;
            ResidueInMachine.MILK.count -= CoffeeType.LATTE.milk;
            ResidueInMachine.BEANS.count -= CoffeeType.ESPRESSO.beans;
            ResidueInMachine.CUPS.count--;
            ResidueInMachine.MONEY.count += CoffeeType.LATTE.price;
            printSuccessMessage();
        }

    }

    public static void buyCappuccino() {
        if (ResidueInMachine.WATER.count < CoffeeType.CAPPUCCINO.water) {
            System.out.println(Messages.WATER.msg);
        }else {
            ResidueInMachine.WATER.count -= CoffeeType.CAPPUCCINO.water;
            ResidueInMachine.MILK.count -= CoffeeType.CAPPUCCINO.milk;
            ResidueInMachine.BEANS.count -= CoffeeType.CAPPUCCINO.beans;
            ResidueInMachine.CUPS.count--;
            ResidueInMachine.MONEY.count += CoffeeType.CAPPUCCINO.price;
            printSuccessMessage();
        }

    }



}
