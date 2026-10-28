import java.util.*;

public class SelectionSortAnalysis {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
  

	System.out.print("Enter number of elements: ");
	  int n = sc.nextInt ();
    int [] arr = new int[n];

    System.out.println("Enter sequence: ");
    for (int i = 0; i < n; i++) {
	arr [i] = sc.nextInt();
	}

    System.out.println("\nInitial sequence:");
    printArray (arr);

    int comparisons = 0;
    int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr [j] < arr [minIndex]) {
                    minIndex = j;
                }
            }
        
        if (minIndex !=i) {
            int temp = arr[minIndex];
            arr [minIndex] = arr [i];
            arr [i] = temp;
            swaps++;
            System.out.println("Step " + (i + 1) + " (swap index " + i + " with " + minIndex + "):");
            printArray(arr);
        }
    

    System.out.println ("\n Total comparisons: " + comparisons);
    System.out.println ("Total swaps: " + swaps);
    System.out.println ("Sorted sequence:");
    printArray (arr);

    sc.close();
        }
    }
    public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            
            }
            System.out.println();
         
    }
}