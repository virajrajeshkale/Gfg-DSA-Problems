//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {   
        ArrayList<Integer> ans= new ArrayList<Integer>();
        int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        
        while(top<=bottom && left <=right)
        {
            
            //left to right 
            
            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            
            //right to bottom
             for(int i=top+1;i<=bottom;i++)
         {   
                ans.add(matrix[i][right]);
            }
            
            // bottom to left 
             for(int i=right-1;i>=left;i--)
            {  if(left == bottom)
             {
                 break;
            }
                ans.add(matrix[bottom][i]);
            }
            //bottom to top
             for(int i=bottom-1;i>=top+1;i--)
            { if(top == right)
             {
                 break;
             }
                ans.add(matrix[i][left]);
            }
            
            
            top++;
            right--;
            bottom--;
            left++;
        }
        
        return ans;
    }
}
