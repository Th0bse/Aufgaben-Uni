package programmiern2.blatt7.aufgabe22;

import java.io.*;

import static IOTools.IOTools.readInt;
import static IOTools.IOTools.readLine;

public class Zeichenstroeme {
    public static void main(String[] args) throws IOException {
        File f1 = new File("src\\main\\java\\programmiern2\\blatt7\\aufgabe22\\" + readLine("Bitte gebe den Dateinamen ein: "));

        File f2 = new File("src\\main\\java\\programmiern2\\blatt7\\aufgabe22\\BlaBla.txt");
        int n = Math.max(0, readInt("Bitte gebe ein in welcher Zeile etwas hinzugefuegt werden soll: "));
        String toBeAdded = readLine("String to be Added: ");
        BufferedReader f = null;
        if (!f1.exists()) {
            BufferedWriter w = new BufferedWriter(new FileWriter(f1));
            w.write(toBeAdded);
            w.newLine();
            w.close();
            System.out.println("No valid input file");
        } else {
        f = new BufferedReader(new FileReader(f1));
        BufferedWriter w = new BufferedWriter(new FileWriter(f2));

        int count = 0;

        String s = "";
        while ((s = f.readLine()) != null && count < n) {
                w.write(s);
                w.newLine();
                count++;
        }
        w.write(toBeAdded);
        w.newLine();
        while ((s = f.readLine()) != null) {
                w.write(s);
                w.newLine();
            count++;
        }
        f.close();
        w.close();
        f = new BufferedReader(new FileReader(f2));
        w = new BufferedWriter(new FileWriter(f1));
        s = "";
        while ((s = f.readLine()) != null) {
            w.write(s);
            w.newLine();
        }
        f.close();
        w.close();
        }
    }
}
