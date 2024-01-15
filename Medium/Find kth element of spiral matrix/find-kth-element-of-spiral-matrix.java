//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int a[][], int n, int m, int k)
    {
	    int left = 0,top=0,right = m-1,bottom = n-1;
	    int count=0;
	    while(left <=right && top <=bottom)
	    {
	        //left to right
	        for(int i=left;i<=right;i++)
	        {  count++;
	            if(count==k)
	            {
	                return a[top][i];
	            }
	        }
	        
	        //top to bottom 
	        
	        for(int i=top+1;i<=bottom;i++)
	        {  count++;
	            if(count==k)
	            {
	                return a[i][right];
	            }
	        }
	        
	        //right to left 
	        
	        for(int i=right-1;i>=left;i--)
	        { count++;
	            if(count==k)
	            {
	                return a[bottom][i];
	            }
	        }
	        
	        for(int i=bottom-1;i>=top+1;i--)
	        { count++;
	            if(count==k)
	            {
	                return a[i][left];
	            }
	        }
	        
	        left++;
	        right--;
	        top++;
	        bottom--;
	       
	    }
	     return 0;
    }
}