package Devv;

public class Main {
    public static void main(String[] args) {
        int num = 230;
        Car bmw = new Car((short)num);
        bmw.setAll("m3",1238.5f, "Белый",false);
        bmw.printAll();


        Car mercedes = new Car("s500",3002.58f, "Черный",true);
        mercedes.speed = 320;

        Car audi = new Car("R8",2081.3f, "Серебристый",true);
        audi.speed = 320;


    }
}
