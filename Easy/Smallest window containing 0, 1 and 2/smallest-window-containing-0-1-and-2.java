//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String X) {
       
       int i=0,j=0,zero=0,one=0,two=0;
       int minlen = Integer.MAX_VALUE;
       while(j<X.length())
       {
        if(X.charAt(j)=='0')
        {
            zero++;
        }
        else
        if(X.charAt(j)=='1')
        {
            one++;
        }
        else
        {
            two++;
        }
        
            while (one>0 && two >0 && zero>0)
            {
                    minlen = Math.min(minlen , j-i+1);
                    
                    if(X.charAt(i)=='0')
                {
                    zero--;
                }
                else
                if(X.charAt(i)=='1')
                {
                    one--;
                }
                else
                {
                    two--;
                }
                i++;
            }
            j++;
       }
       
       return ((minlen == Integer.MAX_VALUE) ? -1 : minlen );
    }
};
