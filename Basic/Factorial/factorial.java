//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorial(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    
//   static long fact(long N)
//     {
//         if(N==1)
//         {
//             return 1;
//         }
//         N = N*fact(N-1);
//         return N;
//     }
    static long factorial(int N){
        
        // long ans = fact(N);
        
        // return ans;
         long ans =1;
        if(N==1)
        {
            return 1;
        }
        
        for(int i=2;i<=N;i++)
        {
           
           ans = ans*i;
        }
        return ans;
        
    
    }
}