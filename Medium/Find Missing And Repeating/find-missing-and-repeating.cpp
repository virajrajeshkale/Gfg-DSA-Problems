//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
class Solution{
public:
    vector<int> findTwoElement(vector<int> arr, int n) {
        
         vector<int> ans;
         int x=0;
         unordered_map <int ,int > map;
          
        for(int i=0;i<n;i++)
        {
            map[arr[i]]++;
        }
         
        unordered_map <int ,int > :: iterator itr;
        
        for( itr=map.begin();itr!=map.end();itr++)
        {
            if(itr->second >1)
            {
                ans.push_back(itr->first);
                x=itr->first;
                
            }
            
        }
        
          for(int i=1;i<n+1;i++)    {
            if(map[i]==0)
            ans.push_back(i);
        }
         //sort(arr.begin(),arr.end());
    //      int z=1;
    //   for(int i=0;i<n;i++)
    //   {
    //       if(arr[i]!=z )
    //       {
    //           ans.push_back(z);
    //           break;
    //       }
    //      z++;
    //   }
         return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> a(n);
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        auto ans = ob.findTwoElement(a, n);
        cout << ans[0] << " " << ans[1] << "\n";
    }
    return 0;
}
// } Driver Code Ends