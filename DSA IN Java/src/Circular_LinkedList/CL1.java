package Circular_LinkedList;

public class CL1
{
    private ListNode last;
    private static int length;
    static class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;


        }
    }

    public void display()
    {
        ListNode temp=last.next;
        while(temp!=last)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

    public boolean isEmpty()
    {
        return length==0;
    }

    public CL1()
    {
        this.last=null;
        this.length=0;
    }

    public void insertatstart(int data)
    {
        ListNode newnode=new ListNode(data);
        if(last==null)
        {
            last=newnode;
            last.next=last;
        }
        else
        {
            ListNode temp=last.next;
            last.next=newnode;
            newnode.next=temp;
        }
        length++;

    }

    public void insertatend(int data)
    {
        ListNode newnode=new ListNode(data);
        if(last==null)
        {
            last=newnode;
            last.next=last;
        }
        else
        {
            ListNode temp=last.next;
            last.next=newnode;
            newnode.next=temp;
            last=newnode;
        }
        length++;
    }

    public void delfromstart()
    {
        if(last==null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            last.next=last.next.next;

        }
        length--;
    }
    public void delfromend()
    {
        if(last==null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            ListNode dumb=last;
            ListNode temp=last.next;
            while(temp!=last)
            {

                temp=temp.next;
                dumb=dumb.next;
            }
            dumb.next=temp.next;
            last=dumb;
        }
        length--;
    }
    public int length()
    {
        return length;
    }
    public static void main(String[] args) {
        System.out.println("It is similar to Singly Linked lIts only rhe last node points to the first node and not null." +
                "Instead of head we keep track of the last node in Circular Singly Linked LIST");
        CL1 s1=new CL1();
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        s1.last=fourth;

        //MANUALLY SETTING THE LENGTH OF THE LINKED LIST FOR THESE INITIAL NODES
        s1.length=4;

        s1.display();
        System.out.println();
        s1.insertatstart(61);
        s1.display();
        System.out.println();
        s1.insertatend(62);
        s1.display();
        System.out.println();
        s1.delfromstart();
        s1.display();
        System.out.println();
        s1.delfromend();
        s1.display();



    }
}
