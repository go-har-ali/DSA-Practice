package Lab_Four;
import java.util.*;

public class Queue {
    //int i=Integer.parseInt(s);

    //String str= sc.nextLine();
    Scanner scan = new Scanner(System.in);
    int size;
    Queue(int size) {
        this.size = size;
    }

    int[] queue = new int[10];

    String test;
    public void testing(){
        test = scan.nextLine();

        int result = Integer.parseInt(test);

        System.out.print(" " + result);

    }

     int[] numbers = new int[10];
    public void convertStringToIntegers(String[] words){
        for(int i = 0; i<words.length; i++){
            String word = words[i];
            int num1 =0;
            int sum =0;
            for(int j=0; j<word.length(); j++)
            {
                num1 = (int) word.charAt(j);
                sum  += num1;
               
                
            }
             numbers[i] = sum;
             System.out.println(numbers[i]);
        } 
    }

    String str;
    String wordArray[];
    public void arrayOfWords(){
        System.out.print("Enter sequence of words: ");
        str = scan.nextLine();
        wordArray = str.split(" ");
        convertStringToIntegers(wordArray);
    }

   

    public void Enqueue(){

        for(int i=0; i<queue.length; i++)
        {
            queue[i] = numbers[i];
        }
    
    }

    public void deQueue(){
        queue[0] = -1;
        for(int i=0; i<queue.length-1; i++)
        {
            int temp = queue[i];
            queue[i]= queue[i+1];
            queue[i+1] = temp;
        }
    }

    public void displayQueue()
    {
        System.out.println("*****Your Queue*****");
        System.out.println();
        for(int i=0; i<queue.length; i++)
        {
            System.out.print(queue[i]+", ");
        }
    }
    
    public static void main(String args[]){
        Queue q = new Queue(100);
        //q.arrayOfWords();
        //q.convertStringToIntegers();
        //
        q.arrayOfWords();
        q.displayQueue();
        q.Enqueue();
        q.displayQueue();
        q.deQueue();
        q.deQueue();
        q.displayQueue();
        
    }
}
