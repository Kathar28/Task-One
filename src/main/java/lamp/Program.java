package main.java.lamp;

public class Program {
    public static void main(String[] args){
        Lamp simpleLamp = new Lamp("Blue");

        simpleLamp.lampInfo();

        simpleLamp.turnOn();
        simpleLamp.lampInfo();

        simpleLamp.turnOff();
        simpleLamp.lampInfo();

        simpleLamp.setColor("Yellow");

        simpleLamp.turnOn();
        simpleLamp.lampInfo();

        simpleLamp.turnOn();
        simpleLamp.lampInfo();
    }
}
