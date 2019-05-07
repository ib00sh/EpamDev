package Devv;

abstract class Car {
    protected short speed;
    private String model;
    private float weight;
    private String color;
    private boolean isWork;

    class Driving {
        private boolean isDrive;

        public Driving(boolean isDrive) {
            this.isDrive = isDrive;
        }

        void drive() {
            System.out.println(this.isDrive);
        }
    }

    Driving engine = new Driving(true);


    Car(String model, float weight, String color, boolean isWork) {
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
       // printAll();
    }

    void setAll (String model, float weight, String color, boolean isWork){
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
    }

    Car(short speed) {
        this.speed = speed;
    }

    protected void printAll(){
        String isWork = this.isWork ? "работает" : "не работает";
        System.out.println("Автомобиль марки " + this.model + ", имеет скорость: "
        + this.speed + " и вес: " + this.weight + ". Его цвет " + this.color
        + " и он " + isWork);
    }

    abstract void startEngine();

}
