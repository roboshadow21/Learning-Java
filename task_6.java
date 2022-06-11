package java_project;

import java.util.Arrays;

public class task_6 {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{3, 9, 7, 8, 4, 1, 2, 23, 5};
        int[] result = MergeSort(unsortedArray, 0, unsortedArray.length - 1);
        for (int  number: result) System.out.println(number);
    }
    static int[] MergeSort(int[] array, int idxLeft, int idxRight) {
        if (idxRight <= idxLeft)
            return array;
        int mid = idxLeft + (idxRight - idxLeft) / 2;
        MergeSort(array, idxLeft, mid);
        MergeSort(array, mid + 1, idxRight);

        int[] tempArray = Arrays.copyOf(array, array.length);

        if (idxRight + 1 - idxLeft >= 0) System.arraycopy(
                array, idxLeft, tempArray, idxLeft, idxRight + 1 - idxLeft);

        int i = idxLeft, j = mid + 1;
        for (int k = idxLeft; k <= idxRight; k++) {

            if (i > mid) {
                array[k] = tempArray[j];
                j++;
            } else if (j > idxRight) {
                array[k] = tempArray[i];
                i++;
            } else if (tempArray[j] < tempArray[i]) {
                array[k] = tempArray[j];
                j++;
            } else {
                array[k] = tempArray[i];
                i++;
            }
        }
        return array;
    }

}
