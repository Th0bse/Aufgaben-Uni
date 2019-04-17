package programmiern2.blatt7.aufgabe24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static IOTools.IOTools.*;

public class EingabeRabattmarke {
    public static void main(String[] args) throws IOException {
        int k = readInt("Anzahl der zu erzeugenden Rabattmarken: ");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\main\\java\\programmiern2\\blatt7\\aufgabe23\\Data.dat"));
        oos.writeInt(k);
        for (int i = 1; i <= k; i++) {
            System.out.println("Daten fuer Rabattmarken-Nummer " + i);
            Rabattmarke t = new Rabattmarke(i+1,
                    readLine("Name des Rabattmarken-Besitzers: "),
                    readInt("Kundennummer des Rabattmarken-Besitzers:"),
                    readFloat("Wert der Rabattmarke in Prozent:"));
            oos.writeObject(t);
        }
        oos.close();
    }
}