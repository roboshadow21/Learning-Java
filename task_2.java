package task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> s = GetUserNumbers();
        int numberA = s.get(0);
        int numberB = s.get(1);
        ShowCommands(numberA, numberB);

        }
    static ArrayList<Integer> GetUserNumbers() {
        ArrayList<Integer> li = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter the number a:  ");
        boolean flag1 = iScanner.hasNextInt();
        System.out.println(flag1);
        int numberA = iScanner.nextInt();
        li.add(0, numberA);
        System.out.println("Enter the number b: ");
        boolean flag2 = iScanner.hasNextInt();
        System.out.println(flag2);
        int numberB = iScanner.nextInt();
        li.add(1, numberB);
        iScanner.close();
        return li;

    }

    static void ShowCommands(int a, int b) {
        int c = 2;
        int d = 1;
        if (a > b) System.out.println("There is no solution");
        else {
            while (a < b - a) {
                a = a * c;
                System.out.println("K1");
            }
            while (a != b) {
                a += d;
                System.out.println("K2");

            }

        }

    }

}

