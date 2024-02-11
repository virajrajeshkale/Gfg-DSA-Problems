//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    //  public static void updatearr(int result,int ans)
    //   {
    //       while(result!=0)
    //       {
    //           int rem=result %10;
    //           ans.add(rem);
    //           result = result/10;
    //       }
    //   }
       
    static ArrayList<Integer> factorial(int N){
        
       ArrayList<Integer> ans  = new ArrayList<>();
       ans.add(1);//for multiplication
      
       
        for(int i=2;i<=N;i++)
        {   int carray=0;
             for(int j=0;j<ans.size();j++)
             {  int val = ans.get(j)*i+carray; //we can multiply one by one element and store on variable with carray
                ans.set(j,val%10); //store the end value on array list
                carray = val/10;  //find actual carray 
                 
             }
             
             while(carray!=0)
             {
                ans.add(carray%10);
                carray = carray/10;
             }
        } 
        
        Collections.reverse(ans);
        
    
    return ans;
    }
}