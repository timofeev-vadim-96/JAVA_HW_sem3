//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package HW_tasks;

import java.util.ArrayList;
import java.util.Collections;

public class task3 {
    public static String findMinMaxMean(ArrayList<Integer> inputList) {
        int min = Collections.min(inputList);
        int max = Collections.max(inputList);
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum+= inputList.get(i);
        }
        int mean = sum/inputList.size();
        int averageIndex = inputList.size()/2;
        Collections.sort(inputList);
        String newString = "Мин: " + min + ", Макс: " + max + ", Средн. арифм.: " + mean +
                ", Медианное из списка: " + inputList.get(averageIndex);
        return newString;
    }
}
