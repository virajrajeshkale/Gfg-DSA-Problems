//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s)
    { 
           int count=0;
        for(char c : s.toCharArray()){
            if(c=='.') count++;
        }
        String[] parts=s.split("\\.");
        if(count!=3 ||parts.length!=4) return false;
       
        for(String part:parts){
            try{
                int value=Integer.parseInt(part);
                if(value<0 ||value>255) return false;
                if(part.length()>1&&part.charAt(0)=='0') return false;
            }catch(NumberFormatException e){
                return false;
            }
        }
        return true;
    //   String [] str = s.split("\\.");
       
    //   int n =str.length;
    //   if(n!=4)
    //   {
    //       return false;
    //   }
       
    //   if(s.charAt(0)=='0' &&s.charAt(1)=='0')
    //       {
    //           return false;
    //       }
    //   int count=0;
    //   for(int i=0;i<s.length();i++)
    //   {  
    //     if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!='.')
    //       {
    //           return false;
    //       }
    //      if(s.charAt(i)=='.')
    //      {
    //          count++;
    //      }
    //   }
    //   if(count!=3)
    //   {
    //       return false;
    //   }
    //   for(int i=0;i<str.length;i++)
    //   {    
    //       if (str[i].equals(""))
    //       {
    //           return false;
    //       }
           
    //       int val=Integer.parseInt(str[i]); 
           
    //       if(val >255 || val<0 )
    //       {
    //           return false;
    //       }
    //   }
        
    //     return true;
    }
}