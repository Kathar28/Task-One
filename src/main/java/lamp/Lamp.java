package main.java.lamp;

class Lamp {

    private boolean isOn;

    private boolean isBroken;

    private int usageResource;

    private int turnOnCounter;

    private final int voltageLamp;

    private int voltagePower;

    private String color;


    public Lamp(String color, int voltageLamp, int usageResource) {
        isOn = false;
        isBroken = false;
        voltagePower = 220;
        this.color = color;
        this.voltageLamp = voltageLamp;
        this.usageResource = usageResource;
    }

    public void turnOn() {
        if (!isBroken || turnOnCounter != usageResource || voltagePower == voltageLamp) {
            isOn = true;
            turnOnCounter++;
        } else {
            brokeLamp();
        }
        if (voltagePower > voltageLamp) {
            brokeLamp();
        }
        if (voltagePower < voltageLamp) {
            turnOff();
        }
    }

    public void turnOff() {
        if (!isBroken) {
            isOn = false;
        }
    }

    private void brokeLamp() {
        isBroken = true;
        isOn = false;
    }

    public void lampInfo() {
        System.out.println("Характеристика лампы:" +
                "\n Ресурс использования: " + getUsageResource() +
                "\n Напряжения питания : " + getVoltageLamp() +
                "\n Цвет лампы : " + getColor());
    }

    public void lampState() {
        if (isOn) {
            System.out.println("Лампа включена.");
        } else if (voltagePower < voltageLamp) {
            System.out.println("Лампа выключена. Не хватает напряжения.");
        } else {
            System.out.println("Лампа выключена.");
        }

        if (isBroken && turnOnCounter == usageResource) {
            System.out.println("Лампа сломана. Ресурс лампы выработан");
        }

        if (isBroken && voltagePower > voltageLamp) {
            System.out.println("Лампа сломана из-за высокого напряжения");
        }
    }

    public int getUsageResource() {
        return usageResource;
    }

    public void setUsageResource(int usageResource) {
        this.usageResource = usageResource;
    }


    public int getTurnOnCounter() {
        return turnOnCounter;
    }

    public void setTurnOnCounter(int turnOnCounter) {
        this.turnOnCounter = turnOnCounter;
        if (usageResource == turnOnCounter) {
            brokeLamp();
        } else {
            isOn = true;
        }
    }

    public int getVoltageLamp() {
        return voltageLamp;
    }

    public void setVoltagePower(int voltagePower) {
        this.voltagePower = voltagePower;
        if (voltageLamp != voltagePower) {
            brokeLamp();
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!isBroken) {
            this.color = color;
        }
    }

}
