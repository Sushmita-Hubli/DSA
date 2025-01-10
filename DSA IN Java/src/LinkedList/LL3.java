package LinkedList;

public class LL3
{
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
    public static void main(String[] args) {
        System.out.println("Creating and printing the elements of singly Linked List");

        System.out.println("Creation:\n");
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        head.next=first;
        first.next=second;
        second.next=third;
        System.out.println("Printing the Singly Linked List");
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");


    }
}
