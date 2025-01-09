package Arrays;

public class Array5
{
    public static void main(String[] args) {
        System.out.println("Reversing an array by two methods:");
        System.out.println("method 1:\n");
        int arr1[]={1,2,3,4};
        int brr1[]=new int[arr1.length];
        for(int i=0,j=arr1.length-1;i<arr1.length;i++)
        {
            brr1[i]=arr1[j];
            j--;
        }
arr1=brr1;
        System.out.println("Printing the reversed array:\n");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n\nmethod 2:This is the more optimized way of solving this question");
        int crr1[]={1,2,3,4,5};
        for(int i=0,j=crr1.length-1;i<j;i++)
        {
            int temp=crr1[j];
            crr1[j]=crr1[i];
            crr1[i]=temp;
            j--;

        }
        System.out.println("Printing reversed array: \n");
        for(int i=0;i<crr1.length;i++)
        {
            System.out.print(crr1[i]+" ");
        }
    }
}
