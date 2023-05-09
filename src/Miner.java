import java.util.Random;

public class Miner {
    public static int weightstein = 200;
    public static int weighteisen = 90;
    public static int weightgold = 45;
    public static int weightkupfer = 55;
    public static int weightlapis = 40;
    public static int weightredstone = 50;
    public static int weightdiamant = 20;
    public static int weightsmaragd = 5;

    public static int stein = 0;
    public static int eisen = 0;
    public static int gold = 0;
    public static int kupfer = 0;
    public static int lapis = 0;
    public static int redstone = 0;
    public static int diamant = 0;
    public static int smaragd = 0;


    public static int sum = weightstein + weighteisen + weightgold + weightkupfer + weightlapis + weightredstone + weightdiamant + weightsmaragd ;

    public static void random () throws InterruptedException {
        if (Main.miner == 1){
            int zufallszahl = randomZahl(1,sum);
            if (zufallszahl <= weightstein){
                stein += 1;
                System.out.println("Stein wurde ergraben du hast jetzt: "+ stein);
                Thread.sleep(1000);
                return;
            }
            zufallszahl -= weightstein;

            if (zufallszahl <= weighteisen){
                eisen += 1;
                System.out.println("Eisen wurde ergraben du hast jetzt: "+ eisen);
                Thread.sleep(1000);
                return;
            }
            zufallszahl -= weighteisen;

            if (zufallszahl <= weightgold){
                gold += 1;
                System.out.println("Gold wurde ergraben du hast jetzt: "+ gold);
                Thread.sleep(1000);
                return;
            }
            zufallszahl -= weightgold;

            if (zufallszahl <= weightkupfer){
                kupfer += 1;
                System.out.println("Kupfer wurde ergraben du hast jetzt: "+ kupfer);
                Thread.sleep(1000);
                return;
            }
            zufallszahl -= weightkupfer;

            if (zufallszahl <= weightlapis){
                lapis += 1;
                System.out.println("Lapis wurde ergraben du hast jetzt: "+ lapis);
                Thread.sleep(1000);
                return;
            }
            zufallszahl -= weightlapis;

            if (zufallszahl <= weightredstone){
                redstone += 1;
                System.out.println("Redstone wurde ergraben du hast jetzt: "+ redstone);
                Thread.sleep(1000);
                return;
            }
            zufallszahl -= weightredstone;

            if (zufallszahl <= weightdiamant){
                diamant += 1;
                System.out.println("Diamant wurde ergraben du hast jetzt: "+ diamant);
                Thread.sleep(1000);
                return;
            }
            zufallszahl -= weightdiamant;

            if (zufallszahl <= weightsmaragd){
                smaragd += 1;
                System.out.println("Smaragd wurde ergraben du hast jetzt: "+ smaragd);
                Thread.sleep(1000);
                return;
            }
            zufallszahl -= weightsmaragd;
        }
    }
    static int randomZahl(int von, int bis) {
        Random zufallszahl = new Random();
        return von + zufallszahl.nextInt(bis - von);
    }
}
