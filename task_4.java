package java_project;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        int disks = GetNumberDisks();
        HanoiTower(disks, 'A', 'B', 'C');
    }
    static void HanoiTower(int number, char start, char pivot, char end) {
        if (number == 1) {
            System.out.printf("Move disk 1 from the rod %s to the rod %s\n", start, end);
            return;
        }
        HanoiTower(number - 1, start, end, pivot);
        System.out.printf("Move disk %d from the rod %s to the rod %s\n", number, start, end);
        HanoiTower(number - 1, pivot, start, end);
    }
    static int GetNumberDisks() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter the numbers of the disks:  ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int diskNumber = iScanner.nextInt();
        iScanner.close();
        return diskNumber;
    }
}

