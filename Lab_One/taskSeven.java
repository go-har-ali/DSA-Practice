package Lab_One;

import java.util.*;

public class taskSeven {
    Scanner scan = new Scanner(System.in);
    int[] arr;
    int size=0; 

    public void inputSize()
    {
        System.out.print("Enter the size of array:");
        size= scan.nextInt();
        arr = new int[size];
    }



    public static void main(String args[]){

        taskSeven taskseven = new taskSeven();
        taskseven.inputSize();
        taskseven.inputDataInArray();
        taskseven.checkDuplicate();


      
    }
    
      
    public void checkDuplicate()
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length-1; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }

            }
        }
        System.out.println(count); 
        
    }

    public void inputDataInArray()
    {
        System.out.println("Input " + size + " number of elements in the array :");
        
        for(int i=0; i<size; i++){
            System.out.print("Element - " + i + ": ");
            arr[i] = scan.nextInt();
        }
    }
}
