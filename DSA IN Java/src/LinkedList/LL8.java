package LinkedList;

public class LL8
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
    public void findele(int x)
    {
        ListNode curr=head;
        int count=1;
        while(curr!=null)
        {
            if(curr.data==x)
            {
                System.out.println("Element found at position "+count);
                return;
            }
            else {


                curr = curr.next;
                count++;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        LL8 s1=new LL8();
        s1.head=new ListNode(1);
        ListNode first =new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        s1.head.next=first;
        first.next=second;
        second.next=third;
        s1.display();

        System.out.println("\nFinding an element in a singly Linked List");
        s1.findele(10);


    }
}
