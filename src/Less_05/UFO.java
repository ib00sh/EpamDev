package Less_05;

public class UFO implements Human {
    private int age;
    private Personality person;

    public UFO(int age, Personality person) {
        this.age = age;
        this.person = person;
    }

    @Override
    public void talk() {
        System.out.println("Привет, я инопланетное существо и я могу говорить");
        System.out.println("Персона " +  this.person);
    }

    @Override
    public void walk() {
        System.out.println("Привет, я инопланетное существо и я могу ходить");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
