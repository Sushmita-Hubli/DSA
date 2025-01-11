package LinkedList;

public class LL11
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
    public int len()
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
    public void findfromend(int pos)
    {
        //lenght=position+1-->logic
        ListNode curr=head;
        System.out.println(len());
        int val=len()-pos;

        int count=0;
        while(count!=val)
        {
            curr=curr.next;
            count++;
        }
        System.out.println("The node element is "+curr.data);

    }
    public static void main(String[] args) {
        LL11 s1=new LL11();
        s1.head=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(4);
        ListNode five=new ListNode(5);
        ListNode six=new ListNode(6);
        ListNode seven=new ListNode(7);
        s1.head.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        s1.display();
        System.out.println("Finding the nth node from the end of a LinkedList");
        //say we want to find the third node from the end
        s1.findfromend(3);

    }
}
