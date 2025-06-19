package practice;

import java.util.Scanner;

public class mergesort {
    
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        
        // Copy data to temporary arrays left[] and right[]
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, mid, right, 0, right.length);
        
        // Recursively sort both subarrays
        mergeSort(left);
        mergeSort(right);
        
        // Merge the sorted subarrays
        merge(array, left, right);
    }
    
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Merge left and right arrays into the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        
        // Copy remaining elements of left[] if any
        while (i < left.length) {
            array[k++] = left[i++];
        }
        
        // Copy remaining elements of right[] if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        mergeSort(array);
        
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}

