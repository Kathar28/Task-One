package main.java.lamp;

public class Program {
    public static void main(String[] args) {
        Lamp simpleLamp = new Lamp("Blue", 220, 10);

        simpleLamp.lampInfo();
        System.out.println("");

        simpleLamp.turnOn();
        simpleLamp.lampState();

        System.out.println("");
        simpleLamp.turnOff();
        simpleLamp.lampState();

        System.out.println("");

        simpleLamp.setColor("Yellow");

        simpleLamp.lampInfo();
        System.out.println("");

        simpleLamp.turnOn();
        simpleLamp.lampState();
        System.out.println("");

        simpleLamp.turnOn();
        simpleLamp.lampState();
        System.out.println("");

        simpleLamp.setTurnOnCounter(10);
        simpleLamp.lampState();
        System.out.println("");

        simpleLamp.setTurnOnCounter(1);
        simpleLamp.lampState();
        System.out.println("");

        simpleLamp.setVoltagePower(230);
        simpleLamp.lampState();

        System.out.println("");

        simpleLamp.setVoltagePower(210);
        simpleLamp.lampState();
    }
}
