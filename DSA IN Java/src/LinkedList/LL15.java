package LinkedList;

public class LL15


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
    public  void detectloop()
    {
        //use of fast and slow pointers
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("Loop detected");
                return;
            }
        }
        System.out.println("Loop doesnt exist");
    }
    public static void main(String[] args) {
        LL15 s1=new LL15();
        s1.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        s1.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=s1.head;
        System.out.println("\nDetecting loop inside a Singly Linked List");
        s1.detectloop();

    }
}
