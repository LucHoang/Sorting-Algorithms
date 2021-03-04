package com.exercise.InsertSort;

public class InsertionSort {
    static int[] list = {2, 9, 5, 4, 8, 1, 6};

    public static void insertionSort(int[] list) {
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\n");

        for (int i=1; i<list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j=i-1; j>=0 && list[j]>currentElement; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = currentElement;
            System.out.println("List after the " + i + "' sort: ");
            for(int k=0; k<list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        insertionSort(list);

    }
}
