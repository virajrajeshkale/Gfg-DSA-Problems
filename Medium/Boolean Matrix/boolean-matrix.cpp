//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends


class Solution
{   
    public:
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(vector<vector<int> > &matrix)
    {
        // int x=1,y=1;
        
        // int m= matrix.size();
        // int n= matrix[0].size();
        
        // for(int i=0;i<matrix.size();i++)
        // {
        //     if(matrix[i][0]==1) y=0;
        // }
        
        // for(int i=0;i<matrix[0].size();i++)
        // {
        //     if(matrix[0][i]==1) x=0;
        // }

        
        // for(int i=1;i<matrix.si;i++)
        // {
        //     for(int j=1;j<matrix[0].length;j++)
        //     {
        //         if(matrix[i][j]==1)
        //         {
        //             matrix[i][0]=1;
        //             matrix[0][j]=1;
        //         }
        //     }
        // }
        
        
        
        // for(int i=1;i<n;i++)
        // {
        //     if(matrix[0][i]==1)
        //     {
        //          for(int j=1;j<matrix[0].length;j++)
        //          matrix[j][i]=1;
        //     }
        // }
        
        // for(int i=1;i<m;i++)
        // {
        //     if(matrix[i][0]==1)
        //     {
        //          for(int j=0;j<matrix[0].length;j++)
        //          matrix[i][j]=1;
        //     }
        // }
        
        // if( x==0)
        // {
        //      for(int i=0;i<matrix[0].lenght;i++)
        //     {
        //         matrix[0][i]==1;
        //     }
        // }
        
        // if( y==0)
        // {
        //      for(int i=0;i<matrix.length;i++)
        //     {
        //         matrix[i][0]==1;
        //     }
        // }
    
    
    int m =matrix.size();
        int n = matrix[0].size();
        int x =1;
        int y =1;
        for(int j=0;j<n;j++)
        {
            if(matrix[0][j]==1)x=0;
            
        }
        
        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==1)y=0;
        }
       
            
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]==1)
                {
                    matrix[i][0]=1;
                    matrix[0][j]=1;
                }
            }
        }
        
        
         for(int j=1;j<n;j++)
        {
           if(matrix[0][j]==1)
           {
               for(int i=1;i<m;i++)
                   matrix[i][j]=1;
           }
        }
        
        for(int i=1;i<m;i++)
        {
            if(matrix[i][0]==1)
            {
                for(int j=0;j<n;j++)
                    matrix[i][j]=1;
            }
        }
        
        if(y==0)
        {
            for(int i=0;i<m;i++)
            {
                matrix[i][0]=1;
            }
        }
        
         if(x==0)
        {      
             for(int j=0;j<n;j++)
            matrix[0][j]=1;
        
        }
    }
    
};


//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    while(t--) 
    {
        int row, col;
        cin>> row>> col;
        vector<vector<int> > matrix(row); 
        for(int i=0; i<row; i++)
        {
            matrix[i].assign(col, 0);
            for( int j=0; j<col; j++)
            {
                cin>>matrix[i][j];
            }
        }
        
        Solution ob;
        ob.booleanMatrix(matrix);


        for (int i = 0; i < row; ++i)
        {
            for (int j = 0; j < col; ++j)
            {
                cout<<matrix[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    return 0;
}



// } Driver Code Ends