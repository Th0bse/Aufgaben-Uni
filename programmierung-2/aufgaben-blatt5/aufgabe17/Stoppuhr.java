package programmiern2.blatt5.aufgabe17;

import java.text.SimpleDateFormat;
import java.util.Date;

import static programmiern2.IOTools.IOTools.readLine; //nutzt IOTools


public class Stoppuhr extends Thread{
    static Date start;
    static Date stop;
    static SimpleDateFormat f = new SimpleDateFormat("HH::mm:ss");

    @Override
    public void run() {
        while(true) {
            if (isInterrupted()) {
                break;
            }
            Date tmp = new Date();
            System.out.println(f.format(tmp));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                interrupt();
            }
        }

    }

    public static void main(String[] args) {
        Stoppuhr tmp = new Stoppuhr();
        readLine("Stoppuhr starten mit Eingabetaste");
        start = new Date();
        System.out.println("Startzeitpunkt: "+f.format(start));
        tmp.start();
        System.out.println("Stoppuhr anhalten mit Eingabetaste");
        readLine();
        stop = new Date();
        tmp.interrupt();
        System.out.println("Stoppzeitpunkt: " + f.format(stop));
        System.out.println("Gesamtlaufzeit: " + (stop.getTime() - start.getTime()) + " ms");



    }
}
