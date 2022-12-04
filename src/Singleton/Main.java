package Singleton;

public class Main {

    public static void main(String[] args) {
        Application app1 = Application.getInstance();
        Application app2 = Application.getInstance();

        app1.Run();
        app2.Run();

        System.out.println(app1 + " " + app2);

    }
}
