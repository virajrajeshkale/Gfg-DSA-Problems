//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] matrix)
    {
          ArrayList<Integer> ans = new ArrayList<Integer>();
          //left to right 
            int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
             while(top<=bottom && left <=right)
        {
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
       // Collections.reverse(ans);
        Collections.reverse(ans);
        int arr1[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
             arr1[i]=ans.get(i);
        }
        return arr1;
    }
}