package BehavioralDesignPattern.Iterator;

public class Client {

    private String name;
    private Integer age;

    private Client(){}

    public Client(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
