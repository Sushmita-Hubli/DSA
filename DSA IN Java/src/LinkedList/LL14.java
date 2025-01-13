package LinkedList;

public class LL14
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
    public void remove(int x)
    {
        ListNode curr=head.next;
        ListNode prev=head;
        ListNode nantr=curr.next;
        if(head.data==x)
        {
            head=head.next;
            return;
        }
        while(curr!=null)
        {
            if(curr.data==x)
            {
                prev.next=nantr;
                return;
            }
            prev=prev.next;
            curr=curr.next;
            nantr=nantr.next;
        }
    }
    public static void main(String[] args) {
        System.out.println("Removing a key from a singly Linked List");
        LL14 s1=new LL14();
        s1.head=new ListNode(21);
        ListNode second=new ListNode(22);
        ListNode third=new ListNode(23);
        ListNode fourth=new ListNode(24);
        ListNode fifth=new ListNode(25);
        s1.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        s1.display();
        //Lets say we want to delete 23
        //for that firstly we will have to find if 23 exists in the Linked List.
        //if it exists then we have to remove it from the List
        s1.remove(23);
        System.out.println();
        s1.display();
        s1.remove(21);
        System.out.println();
        s1.display();
        s1.remove(25);
        System.out.println();
        s1.display();

    }
}
