package strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62};

        Sorter sorter = new Sorter(new QuickSort());
        System.out.println("Original Array: " + Arrays.toString(numbers));

        sorter.sort(numbers);
        System.out.println("Sorted Array with QuickSort: " + Arrays.toString(numbers));

        // Reset array
        numbers = new int[]{34, 7, 23, 32, 5, 62};
        sorter.setStrategy(new MergeSort());

        sorter.sort(numbers);
        System.out.println("Sorted Array with MergeSort: " + Arrays.toString(numbers));
    }
}