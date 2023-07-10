package Lab_One;

import java.util.Scanner;

public class taskThree {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input the number of elements to store in the array :");

        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Input" + size + "number of elements in the array :");
        
        for(int i=0; i<size; i++){
            System.out.print("Element - " + i + ": ");
            arr[i] = scan.nextInt();
        }

        System.out.print("The values stored into the array are: ");

        int sum = 0;

        for(int i=0; i<size; i++){
            sum = sum+ arr[i];
        }
        System.out.print(sum);
    }
}
