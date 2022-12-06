package enums;

public enum ResidueInMachine {
    WATER(400),
    MILK(540),
    BEANS(120),
    CUPS(9),
    MONEY(550);

    public int count;

    ResidueInMachine(int count) {
        this.count = count;
    }
}
