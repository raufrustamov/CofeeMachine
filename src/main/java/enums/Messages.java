package enums;

public enum Messages {

    WATER("Sorry, not enough water!"),
    SUCCESS("I have enough resources, making you a coffee!");

    public final String msg;


    Messages(String msg) {
        this.msg = msg;
    }
}
