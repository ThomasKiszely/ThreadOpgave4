import java.util.Scanner;

public class Læser implements Runnable {
    Scanner input = new Scanner(System.in);
    Skriver sk;

    @Override
    public void run() {
        Bogstav bogstav = new Bogstav();
        while (true) {
            System.out.println("Indtast nyt bogstav: ");
            bogstav.setCh(input.nextLine());
            System.out.println(bogstav.getCh());
        }
    }
}
