package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static void swap(Object[] array, int firstIndex, int secondIndex) {
        if (array == null) throw new NullPointerException();
        if (array.length - 1 < firstIndex || array.length - 1 < secondIndex) throw new ArrayIndexOutOfBoundsException();

        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static <T> ArrayList<T> convertToArrayList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
