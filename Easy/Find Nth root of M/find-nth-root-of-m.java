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
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int NthRoot(int n, int m)
    {
    //   int ans=0;
       
    //   for(int i=1;i<=m;i++)
    //   { int mul=1;
    //       for(int j=1;j<=n;j++)
    //       {
    //         mul*= i; 
    //       }
    //       if(mul == m)
    //       {
    //           return i;
    //       }
    //   }
       
       int start = 1,end=m,mid=0;
       //    1        9      5
       while(start<=end)
       { 
           mid=start+(end-start)/2; //5
          long  result = (long)Math.pow(mid,n); //25
           
           
           
           if(result == m)
           {
               return mid;
           }else if(result < m)
           {
               start = mid+1; 
           }else 
           
           {
                end = mid-1;
              
           }
           
       }
       
       return -1;
    }
}