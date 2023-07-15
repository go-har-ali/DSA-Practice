package Lab_One;

import java.util.Scanner;

public class taskTen {
    Scanner scan = new Scanner(System.in);
    int[] arr;
    int size=0; 

    public void inputSize()
    {
        System.out.print("Enter the size of array:");
        size= scan.nextInt();
        arr = new int[size];
    }

    public void inputDataInArray()
    {
        System.out.println("Input " + size + " number of elements in the array :");
        
        for(int i=0; i<size; i++){
            System.out.print("Element - " + i + ": ");
            arr[i] = scan.nextInt();
        }
    }

    public void deleteValue()
    {
        
        System.out.print("Select a number to delete from the given array.");
        printArray();
        System.out.println();
        int value = scan.nextInt();
        //int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == value){
                
                arr[i] = -1;
               
                for(int j=i; j<arr.length-1; j++)
               {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
               }
            }
            else
            {
                System.out.println("Value not found.");
            }
        }
        //System.out.println(count); 
        
    }

    public void printArray(){
        System.out.println();
        System.out.print("[");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ",  ");
        }
        System.out.print("]");
    }

    public static void main(String args[]){

        taskTen taskten = new taskTen();
        taskten.inputSize();
        taskten.inputDataInArray();
        taskten.deleteValue();
         
        taskten.printArray();
    }
}
