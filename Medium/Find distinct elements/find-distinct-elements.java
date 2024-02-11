//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int M[][] = new int[N][N];
            String arr[] = in.readLine().trim().split("\\s+");
            for(int i = 0;i < N*N; i++)
                M[i/N][i%N] = Integer.parseInt(arr[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.distinct(M, N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int distinct(int M[][], int N)
    {  int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
            for(int j=0;j<M[0].length;j++)
            {
                map.put(M[0][j],1);
            }
        
        
         for(int i=1;i<M.length;i++)
        {
            for(int j=0;j<M[0].length;j++)
            {
                  if(map.containsKey(M[i][j]) && map.get(M[i][j])==i)
                  {
                      map.put(M[i][j],map.get(M[i][j])+1);
                  }
                 
            }
            
        }
        
        for(Map.Entry <Integer,Integer> it : map.entrySet())
        {
            if(it.getValue()==M.length)
            {
                count++;
            }
        }
        return count;
    }
}