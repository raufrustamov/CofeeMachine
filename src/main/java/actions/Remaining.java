package actions;

import enums.ResidueInMachine;

public class Remaining {
    public static void printCapacity() {
        System.out.println("The coffee machine has:\n"
                + ResidueInMachine.WATER.count + " ml of water\n"
                + ResidueInMachine.MILK.count + " ml of milk\n"
                + ResidueInMachine.BEANS.count + " g of coffee beans\n"
                + ResidueInMachine.CUPS.count + " disposable cups\n"
                + "$" + ResidueInMachine.MONEY.count + " of money\n");
    }
}
