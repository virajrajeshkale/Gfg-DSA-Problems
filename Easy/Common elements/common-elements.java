//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {   ArrayList<Integer> ans = new ArrayList<>();
    
   // int i=0,j=0,k=0;
    // 1 5 10 20 40 80
    //           i
    // 6 7 20 80 100
    //        j
    // 3 4 15 20 30 70 80 120
    //           k
    // while(i<n1 || j<n2|| k<n3)
    // {
    //     if(A[i]==B[j] && A[i-1]!=A[i])//  20 == 20
    //     {   if(B[j]==C[k])
    //         {
    //         ans.add(A[i]); 
    //         i++;j++;k++;
    //         }
    //         else if(B[j]>C[k])//20>4
    //         {
    //             k++;
    //         }
    //     }
    //     else if (A[i]<B[j])// 10<20
    //     {
    //         i++;
    //     }else
    //     {
    //         j++;
    //     }
    // }
    // return ans;
    
               
      HashMap<Integer,Integer> map = new HashMap<>();
       
      for(int i=0;i<A.length;i++)
      {
          
              map.put(A[i], 1);
          
      }
       
      for(int i=0;i<B.length;i++)
      {
          if(map.containsKey(B[i]) && map.get(B[i])==1)
          {
              map.put(B[i], map.get(B[i]) + 1);
          }
      }
       
      for(int i=0;i<C.length;i++)
      {
          if(map.containsKey(C[i]) && map.get(C[i])==2)
          {
              map.put(C[i], map.get(C[i]) + 1);
              ans.add(C[i]);
          }
      }
    //       // Map.Entry<String,String> entry : gfg.entrySet()
    //   for(Map.Entry<Integer,Integer> it:map.entrySet())
    //   {
    //       if(it.getValue()==3 && !ans.contains(it.getKey()))
    //       {
    //           ans.add(it.getKey());
    //       }
    //   }
    //     Collections.sort(ans);
        return ans;
    
    
    }
}