package programmiern2.blatt7.aufgabe23;

import java.io.*;

import static IOTools.IOTools.readLine;

public class TokensIO {
    public static void main(String[] args) throws IOException {
        File i = new File("src\\main\\java\\programmiern2\\blatt7\\aufgabe23\\" + readLine("Input File: "));
        File num = new File("src\\main\\java\\programmiern2\\blatt7\\aufgabe23\\" + readLine("Number Output File: "));
        File rest = new File("src\\main\\java\\programmiern2\\blatt7\\aufgabe23\\" + readLine("Rest Output: "));
        StreamTokenizer st = new StreamTokenizer(new FileReader(i));
        PrintWriter numW = new PrintWriter(new FileWriter(num));
        PrintWriter restW = new PrintWriter(new FileWriter(rest));
        st.eolIsSignificant(false);
        boolean stop = false;
        st.eolIsSignificant(true);
        int tt;
        try {
            do {
                switch (tt = st.nextToken()) {
                    case StreamTokenizer.TT_NUMBER:
                        numW.print(st.nval + " ");
                        break;
                    case StreamTokenizer.TT_WORD:
                        restW.print(st.sval + " ");
                        break;
                    case StreamTokenizer.TT_EOL:
                        numW.println();
                        restW.println();
                        break;
                    case StreamTokenizer.TT_EOF:
                        numW.close();
                        restW.close();
                        stop = true;
                        break;
                }
            } while (!stop);

        } catch (Exception o) {
            System.out.println(o);
        }
    }
}
