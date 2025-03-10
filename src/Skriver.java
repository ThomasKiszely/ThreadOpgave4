public class Skriver implements Runnable {


    @Override
    public void run() {
        Bogstav bogstav = new Bogstav();
        bogstav.setCh("*");
        while(true) {
            System.out.print(bogstav.getCh());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
