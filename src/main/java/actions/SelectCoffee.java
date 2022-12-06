package actions;

import enums.CoffeeType;
import enums.Messages;
import enums.ResidueInMachine;

public class SelectCoffee {
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

    public static void buyEspresso() {
        if (ResidueInMachine.WATER.count < CoffeeType.ESPRESSO.water) {
            System.out.println(Messages.WATER.msg);
        } else {
            ResidueInMachine.WATER.count -= CoffeeType.ESPRESSO.water;
            ResidueInMachine.BEANS.count -= CoffeeType.ESPRESSO.beans;
            ResidueInMachine.CUPS.count--;
            ResidueInMachine.MONEY.count += CoffeeType.ESPRESSO.price;
            System.out.println(Messages.SUCCESS.msg);
            System.out.println();
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
            System.out.println(Messages.SUCCESS.msg);
            System.out.println();
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
            System.out.println(Messages.SUCCESS.msg);
            System.out.println();
        }

    }
    
}
