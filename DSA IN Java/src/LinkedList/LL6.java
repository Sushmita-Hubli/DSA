package LinkedList;

public class LL6
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
    public void insert_at_a_given_position(int pos,int data)
    {
        ListNode newnode=new ListNode(data);
        int count=1;
        if(pos==1)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        ListNode curr=head;
        while (count<(pos-1) && curr!=null)
        {
            count++;
            curr=curr.next;
        }
        ListNode remainingpart=curr.next;
        curr.next=newnode;
        newnode.next=remainingpart;

    }

    public static void main(String[] args) {
        System.out.println("Inserting node at a given position in a Singly Linked List");
        LL6 s1=new LL6();
        s1.head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        s1.head.next=first;
        first.next=second;
        second.next=third;
        s1.display();
        System.out.println();

        s1.insert_at_a_given_position(3,88);//inserting a node at position 3
        System.out.println();
        s1.display();
        System.out.println();
        s1.insert_at_a_given_position(1,90);//inserting a node at position 1
        s1.display();




    }
}
