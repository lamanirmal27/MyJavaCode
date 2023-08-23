import java.io.*;

public class iostream_ex2 {
    public static void main(String[] args)throws IOException {
        File f = new File("readme.txt");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Hello this is file writing example");
        pw.flush();
        pw.close();
        fw.close();
    }
    
}