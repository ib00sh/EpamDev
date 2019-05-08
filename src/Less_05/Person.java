package Less_05;

public class Person implements Human {
    private int age;
    private Personality person;

    public Person(int age, Personality person) {
        this.age = age;
        this.person = person;
    }

    @Override
    public void talk() {
        System.out.println("Привет, я могу говорить");
        System.out.println("Персона " +  this.person);
    }

    @Override
    public void walk() {
        System.out.println("Привет, я могу ходить");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
