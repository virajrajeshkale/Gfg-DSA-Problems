//{ Driver Code Starts
//Initial Template for Java

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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S)
    {
//           int start=0,end=0;
//          int len1,len2;
//       for(int i=0;i<S.length();i++)
//       {
//             len1 = expandfromcenter(S,i,i+1);
//             len2 = expandfromcenter(S,i,i);
           
//           int len = Math.max(len1,len2);
//           if(end-start<len)
//           {
//               start = i-(len-1)/2;
//               end=i+len/2;
//           }
//       }
//       return S.substring(start,end+1);
//     }
//   int  expandfromcenter(String S,int i,int j)
//       {
//           while(i>=0 && j<S.length() &&  S.charAt(i)==S.charAt(j))
//           {
//               i--;
//               j++;
//           }
//           return j-i-1;
//       }
       
        int n = S.length();

        int s = 0;
        int e = 0;

        for (int i = 0; i < n - 1; i++) {
            int si = i;
            int ei = i + 1;

            //Even String
            while (si >= 0 && ei < n && S.charAt(si) == S.charAt(ei)) {
                if (ei - si > e - s) {
                    s = si;
                    e = ei;
                }
                si--;
                ei++;
            }

            si = i - 1;
            ei = i + 1;

            //Odd String
            while (si >= 0 && ei < n && S.charAt(si) == S.charAt(ei)) {
                if (ei - si > e - s) {
                    s = si;
                    e = ei;
                }
                si--;
                ei++;
            }
        }

        return S.substring(s, e + 1);
    }
    
}