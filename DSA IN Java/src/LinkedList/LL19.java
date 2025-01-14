package LinkedList;

public class LL19
{private ListNode head;
        static class ListNode{
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
public static ListNode addtwo(ListNode a, ListNode b)
{
    ListNode dummy=new ListNode(0);
    ListNode tail=dummy;
    int carry=0;
    while(a!=null || b!=null)
    {
        int x=(a!=null)?a.data:0;
        int y=(b!=null)?b.data:0;
        int sum=x+y+carry;
        carry=sum/10;
        int m=sum%10;
        ListNode newnode=new ListNode(m);
        tail.next=newnode;
        tail=tail.next;

        if(a!=null)
        {
            a=a.next;
        }
        if(b!=null)
        {
            b=b.next;
        }
    }

    if(carry>0)
    {
        tail.next=new ListNode(carry);

    }
    return dummy.next;

}
    public static void main(String[] args) {
        LL19 s1=new LL19();
        s1.head=new ListNode(3);
        ListNode two=new ListNode(4);
        ListNode three=new ListNode(3);
        s1.head.next=two;
        two.next=three;
        s1.display();
        System.out.println();

        LL19 s2=new LL19();
        s2.head=new ListNode(5);
        ListNode second=new ListNode(6);
        ListNode third=new ListNode(4);
        s2.head.next=second;
        second.next=third;
        s2.display();
        System.out.println();


        System.out.println("Adding the two Linked List\n");
        LL19 s3=new LL19();
        s3.head=addtwo(s1.head,s2.head);
        s3.display();
    }
}
