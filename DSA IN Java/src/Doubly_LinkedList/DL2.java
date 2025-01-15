package Doubly_LinkedList;

public class DL2
{
    private ListNode head;
    private ListNode tail;
    private static int length;
    static class ListNode
    {
        private int data;
        private ListNode previous;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;

        }
    }

    public DL2()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
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
    public int length()
    {
        return length;
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    public void insertatstart(int data)
    {
        ListNode newnode=new ListNode(data);
        if(isEmpty())
        {
            head=tail=newnode;
        }
        else {
            newnode.next = head;
            head.previous = newnode;
            head = newnode;

        }
        length++;
    }
    public void insertatend(int data)
    {
        ListNode newnode=new ListNode(data);
        if(isEmpty())
        {
            head=tail=newnode;
        }
        else {
            newnode.previous = tail;
            tail.next = newnode;
            tail = newnode;

        }
        length++;
    }
    public void delfromfirst()
    {
        if (isEmpty())
        {
            System.out.println("List is already empty you cannot delete");
            return;
        }
        else if(head==tail)
        {
            head=tail=null;
        }
        else {
            ListNode temp = head.next;
            temp.previous = null;
            head = temp;
        }
        length--;  //this should be executed no matter what . only if the List is empty, this wont execute because we are returning from that if condition
    }

    public void delfromlast()
    {
        if(isEmpty())
        {
            System.out.println("List is already empty so we cannot delete");
            return;
        }
        else if(head==tail)
        {
            head=tail=null;
        }
        else {
            ListNode temp = tail.previous;
            temp.next = null;
            tail = temp;
        }
        length--;
    }
    public static void main(String[] args) {
        System.out.println("Inserting node at the beginning of a doubly Linked List\n");
        DL2 s1=new DL2();
        s1.head=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        s1.head.next=second;
        second.previous=s1.head;
        second.next=third;
        third.previous=second;
        s1.tail=third;
        s1.length=3;
        s1.display();
        System.out.println("\nLength of the list is "+s1.length());
        System.out.println();
        s1.insertatstart(9);
        s1.display();
        System.out.println();
        s1.insertatend(10);
        s1.display();
        System.out.println();
        s1.delfromfirst();
        s1.display();
        System.out.println("\nlength="+s1.length());
        System.out.println();
        s1.delfromlast();
        s1.display();
      



    }
}
