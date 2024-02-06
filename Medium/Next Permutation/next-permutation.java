//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
       int index=-1;
       
       List<Integer> ans = new ArrayList<>();
       
      // find brakpoint by back side
      for(int i=N-2;i>=0;i--)
      {
        if(arr[i]<arr[i+1])
        {
            index=i;
            break;
        }
      }
      
      //if index==-1 that means array is sortes then you can return reverse array
      
      if(index==-1)
      {
          Collections.reverse(Arrays.asList(arr));
      }else
      {
          //if find break point arr[index]then find which is geater element form back
          
          for(int i=N-1;i>=0;i--)
          {
              if(arr[index]<arr[i])
              {
                  int temp = arr[index];
                  arr[index] = arr[i];
                  arr[i] = temp;
                  break;// only one element will be swap;
              }
          }
          
      }
      
      // reverse the element from break point to last
      
      int start = index+1;// index+1 because we reverse arraya from after the index point at end array ele
      int end = N-1;
      
      while(start<end)
      {
          int temp=arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;end--;
      }
      
      for(int i=0;i<N;i++)
      {
          ans.add(arr[i]);
      }
      return ans;
    }
}