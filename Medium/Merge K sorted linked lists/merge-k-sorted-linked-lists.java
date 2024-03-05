//{ Driver Code Starts
import java.util.*;

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


class GfG
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Solution g = new Solution();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*class Node
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

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        if(arr.length==0 ||arr==null)return null;
        PriorityQueue <Node> pq = new PriorityQueue<Node>(arr.length,new Comparator<Node>()
        {
            public int compare(Node t1 ,Node t2)
            {
                if(t1.data<t2.data)
                {
                    return -1;
                }else if(t1.data == t2.data)
                {
                    return 0;
                }else
                {
                    return 1;
                }
            }
        });
       
       for(Node node : arr)
       {
           if(node!=null)
           {
               pq.add(node);
           }
       }
       
       Node dumy = new Node(-1);
       Node current = dumy;
       while(!pq.isEmpty())
       {
           current.next= pq.poll();
           current = current.next;
           
           if(current.next!=null)
           {
               pq.add(current.next);
           }
           
       }
       return dumy.next;
       
    }
}
