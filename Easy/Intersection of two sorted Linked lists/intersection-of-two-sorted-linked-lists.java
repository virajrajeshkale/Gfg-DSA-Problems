//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Solution obj = new Solution();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node dummy = new Node(-1);
        Node current=dummy;
       
        
        while(head1!=null && head2!=null)
        {  int val1 = head1.data;
            int val2 = head2.data;
            if(head1.data == head2.data)
            {
                
                 current.next =  new Node(head2.data);;
                 current = current.next;
                 head1 = head1.next;
                 head2 = head2.next;
            }else if( val1 > val2)
            {
                head2 = head2.next;
            }else
            {
                head1 = head1.next;
            }
            
        }
        
        
        // HashMap <Integer,Integer> map = new HashMap<>();
        
        // Node dummy = new Node(-1);
        // Node current=dummy;
        // dummy.next = current;
        
        // while(head1!=null)
        // {
        //     map.put(head1.data,map.getOrDefault(head1.data,1)+1);
            
        //     head1 = head1.next;
        // }
        
        // while(head2!=null)
        // {
            
        //     if(map.containsKey(head2.data))
        //     {
        //      Node newnode = new Node(head2.data);
        //      current.next = newnode;
        //      current = current.next;
        //     }
        //     head2 = head2.next;
        // }
        return dummy.next;
    }
}