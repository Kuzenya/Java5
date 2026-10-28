package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayTasks {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("1", "2", "1", "1", "3", "2"));
        System.out.println("Список без дубликатов: "
                + ArrayListUtils.removeDuplicates(words));

        Integer[] numbers = {12, 4, 19, 4, 7};
        System.out.println("Индекс числа 19: "
                + ArrayListUtils.linearSearch(numbers, 19));
        System.out.println("Индекс числа 100: "
                + ArrayListUtils.linearSearch(numbers, 100));
        System.out.println("Максимум одномерного массива: "
                + ArrayListUtils.max(numbers));

        Integer[][] matrix = {
                {8, 3, 11},
                {6, -2, 9},
                {4, 7, 1}
        };
        System.out.println("Максимум двумерного массива: "
                + ArrayListUtils.max2D(matrix));

        Circle[] circles = {
                new Circle(4.0),
                new Circle(1.5),
                new Circle(3.0)
        };

        Circle largest = ArrayListUtils.max(circles);

        System.out.println("Круг с наибольшим радиусом: " + largest);
    }
}
