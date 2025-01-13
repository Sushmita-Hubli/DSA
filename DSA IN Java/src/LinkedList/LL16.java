package LinkedList;

public class LL16
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
    public ListNode findfirstelement()
    {
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null  )
        {
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            if(slowptr==fastptr)
            {
                return mainmethodfordetection(slowptr);

            }

        }
        return null;

    }
    public ListNode mainmethodfordetection(ListNode slowptr)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp==slowptr)
            {
                return temp;
            }
            else
            {
                temp=temp.next;
                slowptr=slowptr.next;
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        LL16 s1=new LL16();
        s1.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(5);
        ListNode sixth=new ListNode(6);
        s1.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
        System.out.println("Finding the first node of a looped Linked List");
        System.out.println("For this first we will detect a loop in a linked list and then we will pass the slow pointer to another method which will detect the start node of the loop");
        ListNode start=s1.findfirstelement();
        System.out.println("\nFirst node of the loop is "+start.data);


    }
}
