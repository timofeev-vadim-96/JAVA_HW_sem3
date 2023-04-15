//Пусть дан произвольный список целых чисел, удалить из него чётные числа
package HW_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static List<Integer> delEvenNumbs(List<Integer> inputList) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i)%2 != 0){
                newList.add(inputList.get(i));
            }
        }
        return newList;
    }
    public static ArrayList<Integer> createList(int N, int min, int max) {
        ArrayList<Integer> newList= new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            newList.add(rand.nextInt(min, max+1));
        }
        return newList;
    }
}
