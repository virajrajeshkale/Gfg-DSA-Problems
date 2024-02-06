//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
	public:
		int find_median(vector<int> v)
		{
		        int n = v.size();
            int midOdd = n/2;
        
            sort(v.begin(), v.end());
        
            int midEven;
        
            midEven = (v[midOdd] + v[midOdd-1])/2;
            midEven = floor(midEven);
        
            return (n%2==0) ? midEven : v[midOdd];
		}
};

//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n; 
    	cin >> n;
    	vector<int> v(n);
    	for(int i = 0; i < n; i++)
    		cin>>v[i];
    	Solution ob;
    	int ans = ob.find_median(v);
    	cout << ans <<"\n";
    }
	return 0;
}

// } Driver Code Ends