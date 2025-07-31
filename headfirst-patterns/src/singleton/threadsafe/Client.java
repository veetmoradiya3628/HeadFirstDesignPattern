package singleton.threadsafe;

public class Client {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getDescription());
    }
}
