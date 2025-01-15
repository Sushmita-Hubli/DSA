package Doubly_LinkedList;

public class DL1
{
    private ListNode head;
    private ListNode tail;
    private static int length;
    static class ListNode
    {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data)
        {
            this.data=data;

        }

    }

    public DL1()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty()
    {
        return length==0;//head==null
    }
    public int length()
    {
        return length;
    }

    public void display()
    {
        ListNode curr=head;
        while (curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args)
    {
        System.out.println("creating and printing the Doubly Linked List");
        DL1 s1=new DL1();
        s1.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(6);
        s1.head.next=second;
        second.previous=s1.head;
        second.next=third;
        third.previous=second;
        third.next=fourth;
        fourth.previous=third;
        fourth.next=fifth;
        fifth.previous=fourth;
        s1.tail=fifth;
        s1.length=5;//manually setting the length of Linked List
        s1.display();
        System.out.println("\nLength of the Linked List is "+s1.length());

    }
}
