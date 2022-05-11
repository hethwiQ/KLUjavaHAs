import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFile2File {
    static class Copyfile {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.println("Provide source File name: ");
            String sfile = sc.next();
            System.out.println("Provide destination File name: ");
            String dfile = sc.next();
            FileReader fin = new FileReader(sfile);
            FileWriter fout = new FileWriter(dfile, true);
            int c;
            while ((c = fin.read()) != -1) {
                fout.write(c);
            }
            System.out.println("Copy finish...");
            fin.close();
            fout.close();
        }
        /* Code by HethwiQ */
    }
}
