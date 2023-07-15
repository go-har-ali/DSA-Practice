package Lab_One;

import java.util.*;

public class taskNine {
    Scanner scan = new Scanner(System.in);
    int[] arr = {2,1,2,3,4,5,2,7,6,4};
    int size=0; 
 
    int visited = -1;

   
    
    public void input()
    {
        System.out.print("Input the number of elements to be stored in the array :");
        size= scan.nextInt();
    }

    public void inputDataInArray()
    {
        System.out.println("Input " + size + " number of elements in the array :");
        
        for(int i=0; i<size; i++){
            System.out.print("Element - " + i + ": ");
            arr[i] = scan.nextInt();
        }
    }

    // public void checkFrequency()
    // {
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         int count=1;
    //         for(int j=i+1; j<arr.length-1; j++)
    //         {
    //             if(arr[i]==arr[j])
    //             {
    //                 count++;
    //                 freq[j] = visited;
    //             }
    //             if(freq[i] != visited)
    //             {
    //                 freq[i] = count;
    //             }
    //         }
    //     }
    //     //System.out.println(count); 
    // }

    public void findFrequency()
    {
        
        int[] freq = new int[20];
        int[] visited = new int[20];

        for(int i=0; i<arr.length; i++)
        {
            int counter=1;
        
            
            for(int j=i+1; j<arr.length-1; j++)
            {
                
                if(arr[i] == arr[j] && arr[i] != visited[j] )
                {
            
                    counter = counter+1;
                    arr[j] = 0;   
                }
                
            }
            freq[i] = counter;
           
        }

        for(int i=0; i<freq.length; i++)
        {
            System.out.println(visited[i]+" | "+freq[i]);
        }

    }

    // public void printFreq(){
    //     for(int i=0; i<freq.length; i++){
    //         if(freq[i] != visited)
    //         {
    //             System.out.println("Element | Frequency");
    //             System.out.println(arr[i] + " | " + freq[i]);
    //         }
    //     }
    // }

    public static void main(String args[]){

        taskNine tasknine = new taskNine();
        tasknine.findFrequency();
 
    }
}
