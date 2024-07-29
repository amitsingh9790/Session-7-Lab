import java.util.Scanner;

public class Sort {
    // Method to perform bubble sort on an array
    public static int[] bubbleSort(int[] arr){
        int temp = 0; //Temporary variable for swapping
        int n = arr.length;
        boolean isSwapped; //Flag to check if any swapping happened
        for(int i = 0 ;i<n-1; i++){
            isSwapped = false;
            //Inner loop for comparing adjacent elements
            for (int j = 0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped = true; // Set the flag if a swap occurred
                }
            }
            // If no swapping happened, the array is already sorted
            if(!isSwapped)
                break;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Create a Scanner object for input
        System.out.println("How many number you want to store in array?");
        int size = sc.nextInt();
        int[] arr = new int[size]; //Initialize the array with the given size by user

        System.out.println("Enter "+size+" numbers");
        //Loop to take input for each element of the array
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt(); //Store the input in the array
        }
        sc.close(); // Close the scanner

        // Calling BubbleSort method to sort in ascending order
        arr=bubbleSort(arr);

        //Printing the array using for loop
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

