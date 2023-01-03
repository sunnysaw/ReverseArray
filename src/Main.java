/*
In this we will see how can we reverse a given array:
________________________________________________________
Question : Reverse an array consisting of Integer value.
____________________________________________________________
 */

import java.util.Scanner;
public class Main {
    static void reverse(int arr[]){
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1 ; i >= 0; i--){
           temp[j] = arr[i];
            //System.out.print("NOW PRINTING THE SWAPPED VALUE: ");
            System.out.print(" "+ temp[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("ENTER THE VALUE OF ARRAY : ");
        System.out.println("Printing the value of array :");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
           // System.out.println("Printing the value of array :");
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
        System.out.println("NOW PRINTING THE SWAPPED VALUE:");
        reverse(arr);
    }
}