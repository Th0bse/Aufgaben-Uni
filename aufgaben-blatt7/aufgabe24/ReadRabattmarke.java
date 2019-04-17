package programmiern2.blatt7.aufgabe24;

import java.io.*;

public class ReadRabattmarke {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\java\\programmiern2\\blatt7\\aufgabe23\\Data.dat"));
        int k = ois.readInt();
        for  (int i = 0; i < k; i++) {
            Rabattmarke t = (Rabattmarke) ois.readObject();
            System.out.println(t);
        }
        ois.close();
    }
}
