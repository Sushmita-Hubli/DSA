package LinkedList;

public class LL18
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

    public static ListNode merge(ListNode head1, ListNode head2)
    {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
       while(head1!=null && head2!=null)
       {
           if(head1.data<=head2.data)
           {
               tail.next=head1;
               head1=head1.next;
           }
           else
           {
               tail.next=head2;
               head2=head2.next;
           }
           tail=tail.next;
       }
       if(head1==null)
       {
           tail.next=head2;
       }
       else
       {
           tail.next=head1;
       }
       return dummy.next;
    }
    public static void main(String[] args) {
        LL18 s1=new LL18();
        s1.head=new ListNode(1);
        ListNode second=new ListNode(4);
        ListNode third=new ListNode(8);
        s1.head.next=second;
        second.next=third;


        LL18 s2=new LL18();
        s2.head=new ListNode(3);
        ListNode two=new ListNode(6);
        ListNode three=new ListNode(7);
        s2.head.next=two;
        two.next=three;


        System.out.println("Merging these two lists");
        LL18 s3=new LL18();
        s3.head=merge(s1.head,s2.head);
        s3.display();

    }
}
