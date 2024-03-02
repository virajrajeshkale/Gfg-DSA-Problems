//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        return prev;
        
    }
    static Node addTwoLists(Node first, Node second){
        
        Node dumy = new Node(-1);
        Node current = dumy;
        
        Node t1 = reverse(first);
        Node t2 = reverse(second);
        
        int carray=0;
        while(t1!=null || t2!=null)
        {
            int sum=0;
            sum +=carray;
            
            if(t1!=null) sum +=t1.data;
            if(t2!=null)  sum+= t2.data;
            
            Node newnode = new Node(sum%10);
            carray = sum/10;
            
            current.next = newnode;
            current = current.next;
            
            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 = t2.next;
            
            
        }
        
        if(carray!=0)
        {
            Node newnode = new Node(carray);
            current.next = newnode;
            current = current.next;
        }
        current.next=null;
        return reverse(dumy.next);
        
    }
}