package task1;

import java.util.ArrayList;

public final class ArrayListUtils {
    private ArrayListUtils() {
    }

    // Удаление дубликатов
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Алгоритм линейного поиска
    public static <E> int linearSearch(E[] array, E key) {
        for (int i = 0; i < array.length; i++) {
            if (key == null ? array[i] == null : key.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    // Поиск наибольшего элемента массива
    public static <E extends Comparable<? super E>> E max(E[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }

        E maximum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maximum) > 0) {
                maximum = array[i];
            }
        }

        return maximum;
    }

    // Поиск наибольшего элемента двумерного массива
    public static <E extends Comparable<? super E>> E max2D(E[][] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }

        E maximum = null;
        boolean found = false;

        for (E[] row : array) {
            if (row == null) {
                continue;
            }

            for (E item : row) {
                if (item != null && (!found || item.compareTo(maximum) > 0)) {
                    maximum = item;
                    found = true;
                }
            }
        }

        if (!found) {
            throw new IllegalArgumentException("В двумерном массиве нет элементов.");
        }

        return maximum;
    }
}

