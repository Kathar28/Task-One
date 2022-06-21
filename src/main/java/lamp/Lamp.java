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
        isOn = false;
        isBroken = false;
        this.color = color;
    }

    public void turnOn() {
    isOn = true;
    turnOnCounter++;
    if (turnOnCounter == 3){
        brokeLamp();
    }
    }

    public void brokeLamp(){
        isBroken = true;
        isOn = false;
    }

    public void turnOff() {
    isOn = false;
    }

    public void lampInfo(){
        if(isOn){
            System.out.println("Лампа цвета - " + getColor() + " включена.");
        }else {
            System.out.println("Лампа цвета - " + getColor() + " выключена.");
        }
        if(isBroken){
            System.out.println("Лампа цвета - " + getColor() + " сломана.");
        }

    }
}
