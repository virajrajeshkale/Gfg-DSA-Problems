//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        
        String s1 = str;
        String s2 = str;
        
        int n =str.length()+1;
        
        //2 dimensional array with size n+1
        int arr[][] = new int [n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {   //add zero in multi dimesional arra for sum get done
                if(i==0 ||j==0)
                {
                    arr[i][j]=0;
                }else if(s1.charAt(i-1)==s2.charAt(j-1) && i-1!=j-1)
                {
                  arr[i][j] = 1+arr[i-1][j-1];   
                }else
                {
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return arr[n-1][n-1];
     
    //  String   s1 = str;
    //  String s2 = str;
    //  //extra one add for first row and coloum value add zero
    //  int n = str.length()+1;
     
     
    //  //2 dimensional array banun tyat max value takychi
    //  int lrs[][] = new int[n][n];
     
    //  for(int i=0;i<n;i++)
    //  {
    //      for(int j=0;j<n;j++)
    //      {   //pahilynda row ani column chivalue hi zero tkychi mhnje next add la proble nahi
    //          if(i==0 || j==0)
    //          {
    //              lrs[i][j]=0;
    //          }else
    //          if(s1.charAt(i-1)==s2.charAt(j-1) && i-1!=j-1)
    //          {
    //              lrs[i][j] = 1+ lrs[i-1][j-1];
    //          }else
    //          {
    //              lrs[i][j] = Math.max(lrs[i-1][j],lrs[i][j-1]);
    //          }
    //      }
    //  }
    //  return lrs[n-1][n-1];
    }
}