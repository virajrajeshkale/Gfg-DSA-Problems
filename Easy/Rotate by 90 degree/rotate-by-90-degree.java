//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int x) 
    {  int n= matrix.length-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j][n-i];
                matrix[n-j][n-i]=temp;
            }
        }
        
        for(int i=0;i<matrix.length/2;i++)
        {
            for(int j=0;j<x;j++)
            {
                
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][n-i];
                matrix[j][n-i]=temp;
            }
        }
        
    }
}