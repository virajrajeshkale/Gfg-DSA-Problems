//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    long[] arr= new long[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        arr[i] = Long.parseLong(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(arr, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(arr[i] + " ");
		    System.out.println(sb);
		}
	}
}




// } Driver Code Ends


class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
    
    //taking greater value than greatest value of an array we know the last one of array value is greatest that why ewe add 1 in that
    long key = arr[n-1]+1;
    
    // use two pointer approch
    int j=0;
    int k=n-1;
    
    for(int i=0;i<n;i++)
    {
        //find even place  & odd
        if(i%2==0)
        {
            arr[i] = (arr[k]%key)*key+arr[i];
            k--;
        }else
        {
            //odd
            arr[i] = (arr[j]%key)*key+arr[i];
            j++;
        }
        
    }
    
    for(int i=0;i<n;i++)
    {
        arr[i] = arr[i]/key;
    }
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    //   long key = arr[n-1]+1;
    //   int j=0;
    //   int k = n-1;
    //   for(int i=0;i<n;i++)
    //   {    //even
    //       if(i%2==0)
    //       {
    //          arr[i] = (arr[k] % key)*key+arr[i];
    //          k--;
    //       }else
    //       {
    //         arr[i] = (arr[j]%key)*key+arr[i];   
    //         j++;
    //       }
    //   }
       
    //   for(int i=0;i<n;i++)
    //   {
    //       arr[i] = arr[i]/key;
    //   }
        
    }
    
}


