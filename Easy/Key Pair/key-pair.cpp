//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	// Function to check if array has 2 elements
	// whose sum is equal to the given value
	bool hasArrayTwoCandidates(int arr[], int n, int x) {
	    
	   bool ans = false;
	   unordered_map<int ,int>map;
	   
	   
	   for(int i=0;i<n;i++)
	   {  if(arr[i]<x)
    	   {
    	       int a = x-arr[i];
    	  
    	   
    	   if(map.find(a) !=map.end()) return true;
    	   
    	    map[arr[i]]++;
    	   } 
	   
	   }
	   //int l=0,r=1;
	   //while(l!=n-1)
	   //{   if(arr[l] <=x && arr[r]<=x)
    // 	   {
    // 	       if(arr[l]+arr[r]==x)
	   //    {
	   //        return true;
	   //    }
	   //    else
	   //    {
	   //        r++;
	   //    }
	       
	   //    if(r==n-1)
	   //    {
	   //        l++;
	   //    }
    // 	   }
	       
	   //}
	   return false;
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, x;
        cin >> n >> x;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.hasArrayTwoCandidates(arr, n, x);
        cout << (ans ? "Yes\n" : "No\n");
    }
    return 0;
}

// } Driver Code Ends