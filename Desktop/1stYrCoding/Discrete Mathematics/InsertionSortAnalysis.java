import java.util.*;

public class InsertionSortAnalysis {
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements:  ");
        int n = sc.nextInt ();
        int [] arr = new int [n];
        
        System.out.print("Enter sequence "); 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nInitial sequence: ");
        printArray(arr);

        int comparisons = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr [j];
                j--;
                comparisons++;
            }

            if (j >= 0) comparisons++;

            arr[j+1] = key;
            System.out.println("Step " + i + ": ");
            printArray(arr);
        }
        System.out.println("\nTotal comparisons made: " + comparisons);
        System.out.println("Sorted sequence: ");
        printArray(arr);

        sc.close();
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}