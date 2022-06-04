package java_project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_3 {
    public static void main(String[] args) throws IOException {
        testLog();
        int number = ReadNumber();
        int result = TriangleNumber(number);
        String s = Integer.toString(result);
        WriteTriangleNumber(s);


    }
    static int TriangleNumber(int number) {
        return (number * (number + 1)) / 2;
    }

    static int ReadNumber() {
        int num = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String symbol = br.readLine();
            br.close();
            num = Integer.parseInt(symbol);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return num;
    }
    static void WriteTriangleNumber(String num) {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write(num);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    static void testLog() throws IOException {
        Logger logger = Logger.getLogger(task_3.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        SimpleFormatter txtFormat = new SimpleFormatter();
        fh.setFormatter(txtFormat);
        logger.log(Level.INFO, "Test logging");
    }
}
