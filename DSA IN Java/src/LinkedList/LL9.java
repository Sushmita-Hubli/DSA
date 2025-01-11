package LinkedList;

public class LL9
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
    public void reverse()
    {
        ListNode currentnode=head;
        ListNode nextnode=null;
        ListNode previousnode=null;
        while(currentnode!=null)
        {
            nextnode=currentnode.next;
            currentnode.next=previousnode;
            previousnode=currentnode;
            currentnode=nextnode;

        }
        head=previousnode;
    }
    public static void main(String[] args)
    {
        LL9 s1=new LL9();
        s1.head=new ListNode(1);
       ListNode first =new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        s1.head.next=first;
        first.next=second;
        second.next=third;
        s1.display();
        System.out.println("\nReversing the linkedList");
        s1.reverse();
        s1.display();

    }
}
