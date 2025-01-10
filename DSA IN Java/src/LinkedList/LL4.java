package LinkedList;

public class LL4
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
    public int length()
    {
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;
    }
    public static void main(String[] args) {
        LL4 s1=new LL4();
        System.out.println("Finding the length of singly Linked List");
        s1.head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        s1.head.next=first;
        first.next=second;
        second.next=third;
        s1.display();
        System.out.println("\nLength of the singly Linked List is "+s1.length());


    }
}
