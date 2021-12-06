package com.company;
import java.util.Arrays;
public class Ch20_4 {
    public static <T extends Comparable<T>> void selectionSort(T[] data) {
        for (int i = 0; i < data.length; i++) {
            int smallest = i;
            for (int index = i + 1; index < data.length; index++)
                if (data[index].compareTo(data[smallest]) < 0)
                    smallest = index;
            swap(data, i, smallest);
        }
    }
    private static <T> void swap(T[] data, int first, int second) {
        T temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }

    public static void main(String[] args) {
        Integer[] integerData = { 54, 9, 6, 1, 0, 43 };
        System.out.printf("Unsorted integer array:%n%s%n%n", Arrays.toString(integerData));
        selectionSort(integerData);
        System.out.printf("Sorted array:%n%s%n%n%n", Arrays.toString(integerData));

        Float[] floatData = { 64.3f, 5.7f, 25.5f, 74.8f };
        System.out.printf("Unsorted float array:%n%s%n%n", Arrays.toString(floatData));
        selectionSort(floatData);
        System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(floatData));
    }
}