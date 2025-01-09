package Arrays;

public class Array6
{
    public static void main(String[] args) {
        System.out.println("Finding maximum and minimum from an array");
        int arr[]={66,890,77,1,998,7};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("maximum element of an array is: "+max);
        System.out.println();
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("minimum element of an array is: "+min);
    }
}
