package Lab_One;
import java.util.*;
public class taskTwelve {
    Scanner scan = new Scanner(System.in);
    int[][] twoDArray;
    int row;
    int col;
    taskTwelve(int row, int col)
    {
        row = this.row;
        col = this.col;
        twoDArray = new int[row][col];
    }

    public void insertData()
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                twoDArray[i][j] = scan.nextInt();
            }
        }
    }


    public void printArray()
    {
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
               System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void addArray()
    {
        int sum=0;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
              sum +=  twoDArray[i][j];
            }
          
        }
        System.out.println("Total sum of tha array: "+sum);

    }
    public static void main(String[]  args)
    {
        taskTwelve tasktwelve = new taskTwelve(3,3); 
        tasktwelve.insertData();
        tasktwelve.printArray();
        tasktwelve.addArray();
    }

}
