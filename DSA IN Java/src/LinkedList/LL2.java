package LinkedList;


public class LL2
{

    private static class ListNode{

        private int data;
        private ListNode next; //pointer to the next node

        public ListNode(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        System.out.println("Creation of singly Linked List");
        ListNode head=new ListNode(10);
        ListNode second=new ListNode(9);
        head.next=second;
        ListNode third=new ListNode(8);
        second.next=third;
        ListNode fourth=new ListNode(7);
        third.next=fourth;

    }
}
