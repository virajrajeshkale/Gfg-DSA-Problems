//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
         if(s.length()<26) return false;
        
        HashSet <Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++)
        {   if (Character.isLetter(s.charAt(i))) 
            set.add(Character.toLowerCase(s.charAt(i)));
        }

        
        return set.size() == 26 ? true : false;
        
    //   HashSet<Character> set = new HashSet<>();

    //     // Iterate through the string, adding lowercase letters to the set
    //     for (char c : s.toCharArray()) {
    //         if (Character.isLetter(c)) {
    //             set.add(Character.toLowerCase(c));
    //         }
    //     }

    //     // Check if the size of the set is equal to 26 (number of letters in the alphabet)
    //     return set.size() == 26 ? true : false;
        
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends