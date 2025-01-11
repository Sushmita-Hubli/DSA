package LinkedList;

public class LL12
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
    public void del()
    {
        ListNode ptrone=head;
        ListNode ptrtwo=head.next;
        while(ptrtwo!=null)
        {
            if(ptrone.data==ptrtwo.data)
            {
                ptrtwo=ptrtwo.next;
                ptrone.next=ptrtwo;
            }
            else {
                ptrone=ptrone.next;
                ptrtwo=ptrtwo.next;
            }

        }
    }
    public static void main(String[] args) {

        LL12 s1=new LL12();
        s1.head=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(2);
        ListNode four=new ListNode(4);
        ListNode five=new ListNode(5);
        ListNode six=new ListNode(7);
        ListNode seven=new ListNode(7);
        s1.head.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        s1.display();
        System.out.println("\nDeleting the duplicate elements from a Singly LinkedList\n");
        s1.del();
        s1.display();

    }
}
