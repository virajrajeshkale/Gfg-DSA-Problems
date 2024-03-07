//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


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

class Solution
{  
    public static Node addOne(Node head) 
    { 
        
        if(head ==null ) return null;
        //step1 reverse the linked list 
       
       Node prev = null;
        Node current =head;
        Node next;
        
        while(current!=null)
        {
            next = current.next;
            current.next=prev;
            prev = current;
            current =next;
        }
        head =prev;  
        //return head;
       
        Node t1 = head ;
        int carry = 0;
        int add=1;
        
        while(t1!=null)
        {
            int val = t1.data ;
            val += add + carry;
            add=0;
            
            t1.data = val%10;
            carry =val/10;
            
            t1 = t1.next;
            
        }
        
        //add reamaining carray
        if(carry !=0)
        {
        Node it = head;
        while(it.next!=null)
        {
            it = it.next;
        }
        
            Node newnode = new Node(carry);
            it.next = newnode;
        }
       
       //node again reverse the list 
       
         prev = null;
        current =head;
         
        
        while(current!=null)
        {
            next = current.next;
            current.next=prev;
            prev = current;
            current =next;
        }
        head =prev;  
        
       
      return head;
        
    }
}
