package main.java.lamp;

class Lamp {

    private boolean isOn;

    private boolean isBroken;

    private int turnOnCounter;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Lamp(String color) {
        this.isOn = false;
        this.isBroken = false;
        this.color = color;
    }

    public void turnOn() {
    isOn = true;
    this.turnOnCounter++;
    if (this.turnOnCounter == 3){
        brokeLamp();
    }
    }

    public void brokeLamp(){
        this.isBroken = true;
        this.isOn = false;
    }

    public void turnOff() {
    this.isOn = false;
    }

    public void lampInfo(){
        if(isOn){
            System.out.println("Лампа цвета - " + color + " включена.");
        }else {
            System.out.println("Лампа цвета - " + color + " выключена.");
        }
        if(isBroken){
            System.out.println("Лампа цвета - " + color + " сломана.");
        }

    }
}
