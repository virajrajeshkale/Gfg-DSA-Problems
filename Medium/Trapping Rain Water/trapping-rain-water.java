//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        //old code
    //   int left=0;
    //   int right=n-1;
    //   int leftbar=arr[0];
    //   int rightbar=arr[n-1];
       
    //   long long ans;
    //   whie(left<=right)
    //   {
    //         if(leftbar<rightbar)
    //         {
    //             if(arr[left]>leftbar)
    //             {
    //                 leftbar=arr[left];
    //             }
    //             else
    //             {
    //                 ans+=leftbar-arr[left];
    //                 left++;
    //             }
    //         }
    //         else
    //         {
    //             if(arr[right]>rightbar)
    //             {
    //                 rightbar=arr[right];
    //             }
    //             else
    //             {
    //                 ans+=rightbar-arr[right];
    //                 right--;
    //             }
    //         }
    //   }
    //   return ans;
    
    //*****NEW CODE APNA*********//
    
    //step -1  stored left array max size  ** it is an boundary for water at left side
     if(n<3) return 0;
    
    int leftmax [] = new int [arr.length];
    //no other element left side of arr[0]
    leftmax[0] = arr[0];
    
    for(int i=1;i<n;i++)
    {
        leftmax[i] = Math.max(arr[i],leftmax[i-1]); 
    }
   
   
   // step - 2 Stored max array boundar of left 
   
   int rightmax[] = new int [arr.length];
   //we no no other array element at the end of array 
   rightmax[n-1] = arr[n-1];
   
   for(int i= n-2 ;i>0;i--)
   {
       rightmax[i] = Math.max(rightmax[i+1],arr[i]);
   }
   long sum=0;
   //we take min element for both array and subtract it from bar height so it is water level
   for(int i=0;i<n;i++)
   {
       int min  = Math.min(leftmax[i],rightmax[i]);
       int waterlevel = min - arr[i];
       
       if(waterlevel >0)
       {
           sum+=waterlevel;
       }
   }
   return sum;
}

}
