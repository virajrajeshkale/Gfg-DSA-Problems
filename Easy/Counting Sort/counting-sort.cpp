//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;
#define RANGE 255


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    string countSort(string arr){
          vector<int>freq(26,0);
        for(int i=0;i<arr.size();i++){
            int temp=arr[i]-'a';
            freq[temp]++;
        }
        string temp1;
        for(int i=0;i<freq.size();i++){
            char ch='a'+i;
            while(freq[i]--){
                temp1+=ch;
            }
        }
        return temp1;
    }
};


//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        string arr;
        cin>>arr;
        Solution obj;
        cout<<obj.countSort(arr)<<endl;
    }
    return 0;
}

// } Driver Code Ends