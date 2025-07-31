package singleton.enumS;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println(singleton.getDescription());
    }
}
