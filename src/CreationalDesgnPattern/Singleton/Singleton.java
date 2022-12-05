package CreationalDesgnPattern.Singleton;

public class Singleton {

    private static Singleton singleton;

    int counter;

    private Singleton(){}

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void getCounter() {
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
