package LinkedList;

public class LL13
{
    private ListNode head;
    public static class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public void display()
    {
        ListNode curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public void insert(int data)
    {
        ListNode ptr1=head;
        ListNode ptr2=head.next;
        ListNode newnode=new ListNode(data);

        if (head == null || data <= head.data) {
            newnode.next = head;
            head = newnode;
            return;
        }

        while (ptr2!=null)
        {
        if(data>ptr1.data && data<=ptr2.data)
            {
                ptr1.next=newnode;
                newnode.next=ptr2;
                return;
            }

                ptr1=ptr1.next;
                ptr2=ptr2.next;

        }

        //for insertion of node at the last position
        ptr1.next = newnode;
    }
    public static void main(String[] args) {
        LL13 s1=new LL13();
        s1.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(4);
        ListNode fourth=new ListNode(5);
        s1.head.next=second;
        second.next=third;
        third.next=fourth;
        s1.display();
        System.out.println("\nInserting a node in a sorted Linked List\n");
        s1.insert(3);
        s1.display();


    }
}
