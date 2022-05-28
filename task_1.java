package java_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class task_1 {
    public static void main(String[] args) throws Exception {
        Exponent();
    }

    static void Exponent() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str = "";
        StringBuilder s = new StringBuilder();
        while ((str = br.readLine()) != null) {
            s.append(str).append(" ");

        }
        br.close();
        FileWriter fw = new FileWriter("output.txt", false);
        String[] arr = s.toString().split(" ");
        int a = Integer.parseInt(arr[3]);
        int b = Integer.parseInt(arr[1]);
        if (a == 0 && b == 0) {
            fw.write("Not defined");
            fw.flush();
        } else {
            double res = Math.pow(a, b);
            fw.write(Double.toString(res));
            fw.flush();
        }
    }
}