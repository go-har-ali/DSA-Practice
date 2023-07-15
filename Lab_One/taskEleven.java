package Lab_One;
import java.util.*;
public class taskEleven {

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

    public void deleteByPosition()
    {
        
        System.out.print("Enter an index between 0 to "+(arr.length-1));
        System.out.println();
        int index = scan.nextInt();
        //int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i == index){
                
                arr[i] = -1;
               
                for(int j=i; j<arr.length-1; j++)
               {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
               }
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

        taskEleven  taskeleven = new taskEleven();
        taskeleven.inputSize();
        taskeleven.inputDataInArray();
        taskeleven.printArray();
        taskeleven.deleteByPosition();
        taskeleven.printArray();
    }
}
