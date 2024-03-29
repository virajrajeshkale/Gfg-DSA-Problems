//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0)
        {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Node node1 = null;
            Node temp1 = null;
            for (int i = 0; i < N; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node1 == null) {
                    node1 = newNode;
                    temp1 = node1;
                } else {
                    temp1.next = newNode;
                    temp1 = temp1.next;
                }
            }
    
            Node node2 = null;
            Node temp2 = null;
            for (int i = 0; i < M; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node2 == null) {
                    node2 = newNode;
                    temp2 = node2;
                } else {
                    temp2.next = newNode;
                    temp2 = temp2.next;
                }
            }
    
            GfG gfg = new GfG();
            Node result = gfg.mergeResult(node1, node2);
    
            printList(result);
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	        Node t1 = node1;
	        Node t2 = node2;
	        
	        Node dummy = new Node(-1);
	        Node current = dummy;
	        Node prev=null;
	        Node newnode;
	        while(t1!=null && t2!=null)
	        {
	            if(t1.data<t2.data)
	            {
	                 newnode = t1;
	                current.next = newnode;
	                current = current.next;
	                t1 = t1.next;
	            }else if(t1.data> t2.data)
	            {
	                 newnode = t2;
	                current.next = newnode;
	                current = current.next;
	                t2 = t2.next;
	            }else
	            {
	                newnode = t1;
	                current.next = newnode;
	                current = current.next;
	                t1 = t1.next;
	                
	                 newnode = t2;
	                current.next = newnode;
	                current = current.next;
	                t2 = t2.next;
	            }
	        }     
	            if(t1!=null)
	            {
	                current.next = t1;
	            }
	            if(t2!=null)
	            {
	                current.next = t2;
	            }
	            
	            
	            // prev = null;
	            Node curr = dummy.next;
	            Node next;
	            
	            while(curr!=null)
	            {
	                next = curr.next;
	                curr.next = prev;
	                prev = curr;
	                curr = next;
	            }
	        
	           
	            return prev;
	        
    }
}
