package Arrays;
import java.util.*;
public class Array7
{
    public static void main(String[] args) {
        System.out.println("finding second largest element of an array:" );
        int arr[]={66,890,77,991,998,7};
        int max1=arr[0];
        int max2=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max1)
            {
                max2=arr[i];
            }
        }
        System.out.println("Second largest element of an array is : "+max2);


        System.out.println();
        System.out.println("Finding the nth smallest and largest element of an array: \n");
        int[] brr = { 5, 2, 9, 1, 7 };
        int n = 2; // Find the 2nd  or largest element

        Arrays.sort(brr);


        int nthSmallest = brr[n - 1];
        int nthLargest = brr[brr.length - n];//if array size os 5 and we want to find 2nd largest then it will be present on index no 5-2=3

        System.out.println("Nth smallest element: " + nthSmallest);
        System.out.println("Nth largest element: " + nthLargest);
    }
}
