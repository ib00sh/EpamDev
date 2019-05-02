package Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle ferrari = new Vehicle(2, -2, 360, 12);

        System.out.println( "Скорость Ferrari: " + ferrari.getMaxspeed() +  " км/ч");
        System.out.println( "Число колес: " + ferrari.getWheels());

        ferrari.setWheels(4);
        System.out.println( "Число колес (повторно): " + ferrari.getWheels());

    }
}
