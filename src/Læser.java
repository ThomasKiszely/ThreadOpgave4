import java.util.Scanner;

public class Venter implements Runnable {
    Scanner input = new Scanner(System.in);
    Bogstav bogstav = new Bogstav();
    @Override
    public void run() {
        while (true) {
            System.out.println("Indtast nyt bogstav: ");
            bogstav.setCh(input.nextLine());
        }
    }
}
