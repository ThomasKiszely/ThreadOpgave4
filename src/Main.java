public class Main {
    public static void main(String[] args) {
        Skriver skriver = new Skriver();
        Læser læser = new Læser();
        Thread thread = new Thread(læser);
        thread.start();
        Thread thread1 = new Thread(skriver);
        thread1.start();
    }
}