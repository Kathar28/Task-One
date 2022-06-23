package main.java.lamp;

class Lamp {

    private boolean isOn;

    private boolean isBroken;

    private int usageResource;

    private int turnOnCounter;

    private final int voltageLamp;

    //Убрать это параметр


    private String color;

    public Lamp(String color, int voltageLamp, int usageResource) {
        isOn = false;
        isBroken = false;
        this.color = color;
        this.voltageLamp = voltageLamp;
        this.usageResource = usageResource;
    }

    public void turnOn(int voltagePower) {
       if(isOn){
           System.out.println("Лампа уже включена");
       }else if(isBroken){
           System.out.println("Лампа сломана, вы не можете её включить");
       }else {
           isOn = true;
           if(voltagePower > voltageLamp){
               isOn = false;
               brokeLamp();
               System.out.println("Лампа сломана из-за высокого напряжения");
           }
           if(voltagePower < voltageLamp){
               isOn = false;
              System.out.println("Лампа не включилась, не хватает напряжения");
           }

       }
    }

    public void turnOff() {
        if(!isOn){
            System.out.println("Лампа уже выключена");
        }
            isOn = false;
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
        } else if (!isBroken){
            System.out.println("Лампа выключена.");
        }
        else {
            System.out.println("Лампа сломана.");
        }

    }

    public int getUsageResource() {
        return usageResource;
    }



    public int getTurnOnCounter() {
        return turnOnCounter;
    }



    public int getVoltageLamp() {
        return voltageLamp;
    }



    public String getColor() {
        return color;
    }



}
