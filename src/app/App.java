package app;

public class App {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();
        System.out.println("logger1 = " + logger1);
        System.out.println("logger2 = " + logger2);
        System.out.println("logger3 = " + logger3);
    }
}
