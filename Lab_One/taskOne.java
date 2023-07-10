package Lab_One;
import java.util.*;

public class taskOne {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = 10;
        int arr[] = new int[size];
        System.out.println("Input 10 elements in array");
        for(int i=0; i<10; i++){
            System.out.print("Element " + i + ": ");
            arr[i] = scan.nextInt();
            
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
