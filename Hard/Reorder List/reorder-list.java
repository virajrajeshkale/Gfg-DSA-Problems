//{ Driver Code Starts
import java.util.*;

import java.io.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[])throws IOException {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {
            int n = Integer.parseInt(in.readLine());
            ReorderList llist = new ReorderList();

            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(s[i]);
                llist.addToTheLast(new Node(a));
            }

            new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node findmidoffirst(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    void reorderlist(Node head) {
        
        if(head==null || head.next==null) return ;
        Node midnode = findmidoffirst(head);
        
        Node prev = null;
        Node current = midnode.next;
        midnode.next = null;
        Node next;
        
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        Node head1 = prev;
        
        Node t1 = head;
        Node t2 = head1;
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(t1!=null || t2!=null)
        {
            if(t1!=null)
            {
            curr.next = t1;
            curr = curr.next;
            t1=t1.next;
            }
            
            if(t2!=null)
            {
            curr.next = t2;
            curr = curr.next;
            t2=t2.next;
            }
            
        }
        
        if(t1!=null) 
        {
            curr.next = t1;
        }
        if(t2!=null)
        {
            curr.next = t2;
        }
        
        head =  dummy.next;
        
    }
}
