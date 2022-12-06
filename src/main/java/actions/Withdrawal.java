package actions;

import enums.ResidueInMachine;

public class Withdrawal {
    public static void withdrawalMoney() {
        System.out.println("I gave you $" + ResidueInMachine.MONEY.count);
        ResidueInMachine.MONEY.count = 0;
        System.out.println();

    }
}
