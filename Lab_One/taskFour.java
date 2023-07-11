package Lab_One;

import java.util.Scanner;

public class taskFour {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input the number of elements to store in the array :");

        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Input " + size + " number of elements in the array");
        
        for(int i=0; i<size; i++){
            System.out.print("Element - " + i + ": ");
            arr[i] = scan.nextInt();
        }

        System.out.print("The values stored into the first array are: ");

        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        int arr2[] = new int[size];

        System.out.print("\nThe values stored into second the array are: ");

        for(int i=0; i<size; i++){
            arr2[i] = arr[i];
            System.out.print(arr2[i] + " ");
        }
    
    }
}
