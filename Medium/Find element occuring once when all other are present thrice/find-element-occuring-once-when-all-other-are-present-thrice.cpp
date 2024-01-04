//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int singleElement(int arr[] ,int N) {
        map <int ,int> maap;
       
       for(int i=0;i<N;i++)
       {
           maap[arr[i]]++;
       }
       
       map<int,int> :: iterator it;
       for(it=maap.begin();it!=maap.end();it++)
       {
           if(it->second==1)
           {
               return it->first;
           }
       }
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;
        int arr[N];
        
        for(int i=0 ; i<N ; i++)
            cin>>arr[i];

        Solution ob;
        cout<<ob.singleElement(arr,N);
        cout<<"\n";
    }
    return 0;
}
// } Driver Code Ends