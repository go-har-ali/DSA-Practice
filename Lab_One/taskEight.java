package Lab_One;

import java.util.*;

public class taskEight {
    Scanner scan = new Scanner(System.in);
    int[] arr;
    int size=0; 

    public void inputSize()
    {
        System.out.print("Input the number of elements to be stored in the array :");
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
          
    public void checkForUnique()
    {
        int count=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++)
        {

            if(arr[i]==arr[i+1])
            {
                //count++;
            }
            else{
                count++;
            }
        }
        System.out.println(count); 
        
    }

    public static void main(String args[]){

        taskEight taskeight = new taskEight();
        taskeight.inputSize();
        taskeight.inputDataInArray();
        taskeight.checkForUnique();
    }
    
}
