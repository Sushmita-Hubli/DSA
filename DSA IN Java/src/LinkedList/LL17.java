package LinkedList;

public class LL17
{
    private ListNode head;
    static class ListNode
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
    public void removeloop()
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                 mainmethod(slow);
                 return;

            }
        }

    }
    public void mainmethod(ListNode slow)
    {
        ListNode temp=head;
        while(slow.next!=temp.next)
        {
            slow=slow.next;
            temp=temp.next;
        }
        slow.next=null;

    }

    public static void main(String[] args) {
        LL17 s1=new LL17();
        s1.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth =new ListNode(4);
        ListNode fifth=new ListNode(5);
        s1.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=third;

        System.out.println("\nRemoving the loop from Linked List");
        s1.removeloop();
        System.out.println();
        s1.display();
    }
}
