package Arrays;
import java.util.*;

public class Array10
{
    public static void main(String[] args) {
        System.out.println("Find the missing value from the Array: \nthere are two ways of solving this");
        int arr[]={2,4,1,8,6,3,7,5,10};
        System.out.println("method 1\n");
        Arrays.sort(arr);//{1,2,3,4,6,7,8}
        int j=0;



        for (int i=1;i<arr.length;i++)
        {
         if(arr[i]-arr[j]==2)
         {
             int temp=arr[i]-1; //to store the missing number
             System.out.println("missing number is "+temp);
             break;
         }
         else
         {
             j++;
         }
        }
        System.out.println("Method 2");
        int n=arr.length+1;
        int allsum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("missing number is : "+(allsum-sum));

    }
}
