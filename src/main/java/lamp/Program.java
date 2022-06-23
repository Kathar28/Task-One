package main.java.lamp;

public class Program {
    public static void main(String[] args) {
        Lamp simpleLamp = new Lamp("Blue", 220, 10);


        simpleLamp.turnOn(210);
        simpleLamp.lampState();
        System.out.println("");

        simpleLamp.turnOff();
        simpleLamp.lampState();
        System.out.println("");

        simpleLamp.turnOn(230);
        simpleLamp.lampState();
        System.out.println("");

    }
}
