package Devv;

public class BMW extends Car {
    private boolean isMPerfomance = false;
    public static int num = 20;

    public BMW(boolean isMPerfomance, String model, float weight,
               String color, boolean isWork, short speed) {
        super(model, weight, color, isWork);
        this.isMPerfomance = isMPerfomance;
        super.speed = speed;
    }

    @Override
    protected void printAll() {
        super.printAll();
        String isMPerfomance = this.isMPerfomance ? "является " : "не является";
        System.out.println("Машина " + isMPerfomance + " М перфомансе" );
        super.engine.drive();
    }

    @Override
    void startEngine() {
        System.out.println("Машина заводиться с кнопки");
    }

    public static void printTest() {
        System.out.println("тестовая инфорамация");
    }



}
