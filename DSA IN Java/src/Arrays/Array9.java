package Arrays;

public class Array9
{
    public static void main(String[] args) {
        System.out.println("Resizing an array");
        int arr[]={1,2,3,4};
        System.out.println("Printing array length: "+arr.length);
        System.out.println("say we want to resize array to size 8 then we can do following:\n");
        int temp[]=new int[8];
        for(int i=0;i< arr.length;i++)
        {
            temp[i]=arr[i];
        }
        arr=temp;
        System.out.println("array length: "+arr.length);

    }
}
