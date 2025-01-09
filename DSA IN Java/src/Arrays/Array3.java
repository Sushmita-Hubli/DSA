package Arrays;
import java.util.*;

public class Array3
{
    public static void main(String[] args) {
        System.out.println("Dynamically creating and Printing elements of Array in Java");
        int arr[]=new int[5];
        System.out.println("Enter elements of an array");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing elements of an array:\n ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
