package actions;

import enums.ResidueInMachine;

public class Filling {
    public static void addIngredients(int water, int milk, int beans, int cups) {
        ResidueInMachine.WATER.count += water;
        ResidueInMachine.MILK.count += milk;
        ResidueInMachine.BEANS.count += beans;
        ResidueInMachine.CUPS.count += cups;
    }
}
