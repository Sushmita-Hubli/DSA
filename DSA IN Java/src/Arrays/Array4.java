package Arrays;

public class Array4
{
    public static void main(String[] args) {
        System.out.println("Removing even integers from an array");
        int arr[]={1,2,2,3,5,7,8};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        int brr[]=new int[arr.length-count];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                brr[idx]=arr[i];
                idx++;
            }

        }
        System.out.println("Printing this new array with odd elements\n");
        for(int i=0;i<brr.length;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}
