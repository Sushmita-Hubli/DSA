package LinkedList;

public class LL7
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
    public void delfromfirst()
    {
        ListNode curr=head;
        head=curr.next;
    }
    public void delfromlast()
    {
        ListNode curr=head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;

    }

    public void delfrompos(int pos)
    {
        if(pos==1)
        {
            head=head.next;
            return;
        }
        ListNode curr=head;
        int count=1;
        while(count<(pos-1))
        {
            count++;
            curr=curr.next;
        }
        ListNode remaining=curr.next.next;
        curr.next=remaining;

    }
    public static void main(String[] args) {
        System.out.println("Deletion of a node from a Singly Linked List");
        LL7 s1=new LL7();
        s1.head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ListNode fourth=new ListNode(5);
        ListNode fifth=new ListNode(6);
        ListNode sixth=new ListNode(7);
        s1.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        s1.display();
        System.out.println();

        System.out.println("Delete from the first position");
        s1.delfromfirst();
        s1.display();


        System.out.println("\nDelete from the last position");
        s1.delfromlast();
        s1.display();

        System.out.println("\nDeleting a node from a given position in a Singly Linked List");
        s1.delfrompos(3);
        s1.display();

        System.out.println("\nDeleting a node at position one using this newly created method");
        s1.delfrompos(1);
        s1.display();






    }
}
