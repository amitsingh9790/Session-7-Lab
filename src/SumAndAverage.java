import java.util.Scanner;

public class SumAndAverage {
    //Method to calculate the sum of an array
    public static int sum(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
    //Method to calculate the average of an array
    public static float avg(int[] a){
        int sum=0,n=a.length;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return (float)sum/n; // Return the average as a float using cast operator

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Create a Scanner object for user input
        System.out.println("How many number do you want to add and average?");
        int size = sc.nextInt(); //Read the number elements from user
        int[] arr = new int[size];

        System.out.println("Enter "+arr.length+" number:");
        //Loop to get the numbers from the user
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt(); //Read each number and store it in the array
        }

        //Print the sum of all the numbers
        System.out.println("Sum of all the number is "+sum(arr));
        //Print the average of all the numbers
        System.out.println("Average of all the number is "+avg(arr));
    }
}
