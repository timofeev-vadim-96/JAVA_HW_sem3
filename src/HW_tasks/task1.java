//Реализовать алгоритм сортировки слиянием
package HW_tasks;

import java.util.Random;

public class task1 {
    public static int[] mergeSort(int[] inputArr) {
        if (inputArr.length > 1) {
            int mid = inputArr.length / 2;
            int[] left = fillBoarder(inputArr, 0, mid);
            int[] right = fillBoarder(inputArr, mid, inputArr.length);
            mergeSort(left);
            mergeSort(right);
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    inputArr[k] = left[i];
                    i++;
                } else {
                    inputArr[k] = right[j];
                    j++;
                }
                k++;
                }

            while (i < left.length) {
                inputArr[k] = left[i];
                i++;
                k++;
                }
            while (j < right.length) {
                inputArr[k] = right[j];
                j++;
                k++;
                }
            }
        return inputArr;
        }
    public static int[] fillBoarder ( int[] inputListOfInt, int start, int end){
        int[] newArr = new int[end - start];
        int i = 0;
        while (start != end){
            newArr[i] = inputListOfInt[start];
            start ++;
            i++;
        }
        return newArr;
    }
    public static int[] createArr (int n){
        int [] newArr = new int [n];
        Random rand = new Random();
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = rand.nextInt(1,20);
        }
        return newArr;
    }
}
