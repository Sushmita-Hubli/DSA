package Arrays;

public class Array2
{
    public static void main(String[] args) {
        System.out.println("Adding and updating Array Elements:");
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        arr[4]=1;
        arr[2]=9;
//        arr[5]=1;   this line will give exception array index out of bounds
        System.out.println("printing array elements:\n ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
}
