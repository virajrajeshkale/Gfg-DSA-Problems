//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
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
            new Solution().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends

 
/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          Node evennode = null;
        Node oddnode = null;
        Node evenhead  = evennode;
        Node oddhead = oddnode;
        
        Node temp = head;
        int count=1;
        while(temp!=null)
        {
            count++;
            if(count %2==0)
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
       if(evenhead!=null) head = evenhead;
       head = oddhead;
        
          
     }
}
