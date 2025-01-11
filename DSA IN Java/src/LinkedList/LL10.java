package LinkedList;

public class LL10
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
    public void findmid()
    {
        ListNode fastptr=head;
        ListNode slowptr=head;
        while(fastptr!=null && fastptr.next!=null)
        {
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        System.out.println("middlemost node of the LinkedList is "+slowptr.data);

    }
    public static void main(String[] args) {
        LL10 s1=new LL10();
        s1.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(5);
        ListNode sixth=new ListNode(6);
        s1.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        s1.display();
        System.out.println();
        System.out.println("\nFinding the middle node of LinkedList with even number of elements");
        s1.findmid();

        LL10 s2=new LL10();
        s2.head=new ListNode(1);
        ListNode second1=new ListNode(2);
        ListNode third1=new ListNode(3);
        ListNode fourth1=new ListNode(4);
        ListNode fifth1=new ListNode(5);
        s2.head.next=second1;
        second1.next=third1;
        third1.next=fourth1;
        fourth1.next=fifth1;
        s2.display();
        System.out.println("\nFinding the middle node of the LinkedList with odd number of elements");
        s2.findmid();

    }
}
