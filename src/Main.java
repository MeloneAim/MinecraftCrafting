import java.util.Scanner;

public class Main {
    public static int miner = 0;
    public static int inv = 0;
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Wähle eine Auswahlmöglichkeit");
            System.out.println("1.Miner");
            System.out.println("2.Inventar betrachten");
            System.out.println("Bitte schreibe 1 oder 2");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Du schwingst die Spitzhacke...");
                    Thread.sleep(2000);
                    miner = 1;
                    Miner.random();
                    break;
                case 2:
                    System.out.println("Inventar wird aufgerufen");
                    Thread.sleep(2000);
                    inv = 1;
            }
        }
    }
}