package LinkedList;

public class LL5
{
    private ListNode head; //here since this data member is not static, we will have to create object of LL4 and access this member in our main method
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
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }

    public void insertatend(int data)
    {
        ListNode current=head;
        ListNode endnode=new ListNode(data);
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=endnode;

    }

    public static void main(String[] args)
    {
        System.out.println("Inserting node in the beginning of singly Linked List");

        LL5 s1=new LL5();
        s1.head=new ListNode(1);
       ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        s1.head.next=first;
        first.next=second;
        second.next=third;
        s1.display();
        System.out.println();
        ListNode newnode=new ListNode(9);
        newnode.next=s1.head;
        s1.head=newnode;
        s1.display();

        System.out.println();
        System.out.println("Inserting node at the end of a Singly Linked List\n");
        s1.insertatend(88);
        s1.display();


    }
}
