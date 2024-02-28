//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                
                for(int i=0;i<n;i++)
                {  
                    int x = a[i];
                    int rev=0;
                    while(x!=0)
                    {   rev=  rev*10; //220
                        int rem = x%10;  //2
                        rev +=rem; //222
                       x = x /10; 
                        
                    }
                    
                    if(a[i]!=rev) return 0;
                }
                return 1;
           }
}