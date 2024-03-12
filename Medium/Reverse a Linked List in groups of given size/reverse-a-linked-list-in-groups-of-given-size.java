//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    // public static Node getkthnode(Node head , int k)
    // {  k-=1;
    //     while(head!=null && k>0)
    //     {
    //         k--;
    //         head = head.next;
    //     }
    //     return head;
    // }
    // public static Node reverselist(Node head)
    // {
    //     Node prev = null;
    //     Node curr = head;
    //     Node next;
        
    //     while(curr!=null)
    //     {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr=next;
    //     }
    //     head = prev;
    //     return head;
    // }
    public static Node reverse(Node head, int k)
    {
       
        //step 1 handle base case
        
        if(head == null || head.next==null) return head;
        
        //step2
        int count=0;
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr!=null && count <k)
        {
            
            next =curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        if(next!=null)
        {
            head.next = reverse(next,k);
        }
        return prev;
        
        // Node temp = node;
        // Node prevlast =null;
        
        // while(temp!=null)
        // {
        //     Node kthnode = getkthnode(temp,k);
        //     if(kthnode == null)
        //     {
        //         if(prevlast!=null) 
        //         {
        //             prevlast.next = temp;
        //         }
        //         break;
        //     }
            
        //     Node nextnode = kthnode.next;
        //     kthnode.next=null;
             
        //      //call reverse
             
        //      reverselist(temp);
        //      if(temp==node)
        //      {
        //          node = kthnode;
                
        //      }else
        //      {   prevlast.next = kthnode;
                 
        //      }
        //      prevlast = temp;
        //      temp = nextnode;
            
        // }
        // return node;
    }
}

