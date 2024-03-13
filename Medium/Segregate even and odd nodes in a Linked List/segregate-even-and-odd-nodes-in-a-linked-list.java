//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
	static void printList(Node node, PrintWriter out) 
	{ 
		while (node != null) 
		{ 
			out.print(node.data + " "); 
			node = node.next; 
		} 
		out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans, out); 
            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends


//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        
        Node evennode = null;
        Node oddnode = null;
        Node evenhead  = evennode;
        Node oddhead = oddnode;
        
        Node temp = head;
        
        while(temp!=null)
        {
            int val = temp.data;
            if(val%2==0)
            { //it mean node is even
                
                if(evennode != null)
                {
                    evennode.next = temp;
                    evennode = evennode.next;
                }else
                {
                    evennode = temp;
                    evenhead = evennode;
                }
                
            }else
            {  
                if(oddnode!=null)
                {
                    oddnode.next = temp;
                    oddnode = oddnode.next;
                }else
                {
                    oddnode = temp;
                    oddhead = oddnode;
                }
            }
            temp = temp.next;
        }
        
       
       if(evennode !=null) evennode.next = oddhead;
       if(oddnode !=null) oddnode.next = null;
       if(evenhead!=null) return evenhead;
       return oddhead;
        
        
    }
}