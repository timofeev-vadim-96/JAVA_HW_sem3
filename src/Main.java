import HW_tasks.task1;
import HW_tasks.task2;
import HW_tasks.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = task1.createArr(10);
        System.out.println("***** Задача 1 *****");
        System.out.println("Исходный массив: \n"+ Arrays.toString(arr1));
        task1.mergeSort(arr1);
        System.out.println("Отсортированный массив: \n"+ Arrays.toString(arr1)+ "\n");
        System.out.println("***** Задача 2 *****");
        ArrayList<Integer> newList = task2.createList(15, 0, 25);
        System.out.println("Исходный список: \n"+ newList);
        System.out.println("Список без четных чисел: \n"+task2.delEvenNumbs(newList) + "\n");
        System.out.println("***** Задача 3 *****");
        ArrayList<Integer> newList2 = task2.createList(15, 0, 25);
        System.out.println("Исходный список: \n"+ newList2);
        System.out.println(newList2);
        System.out.println(task3.findMinMaxMean(newList2));
    }
}