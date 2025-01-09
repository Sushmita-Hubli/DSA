package Arrays;

public class Array8
{
    public static void main(String[] args) {
        System.out.println("Moving zeros to the end of an array");
        int arr[]={33,78,0,99,0,90,889};
        int j=0;
        for(int i=0;i< arr.length;i++)
        {
            if (arr[i]!=0 && arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            if(arr[j]!=0)
            {
                j++;
            }
        }
        System.out.println("Explanation of code:");
        // int arr[]={33,78,0,99,0,90,889};
        System.out.println("first iteration: initially i anj j both are on indx 0 ,  first if block is false and second is true so j will shift to next position according to second if block . so now i=0 and j=1\n" +
                "second iteration:i will increment.Now both i and j are on index 1. now again in for loop, second if block is true and first is false so j shifts to index 2 . so now i=1 and j=2\n" +
                "third iteration: i will increment.Now both i and j are on index 2. first and second conditions both come out to be false so j remains on index 2. so now i=2 and j=2\n" +
                "fourth iteration:i will increment.Now here i is on index 3 and j is on index 2. here first condition is true so swap will happen . now new array is {33,78,99,0,0,90,889}. after swapping , second condition is also true so j will increment so now i=3 and j=3\n" +
                "fifth iteration:i will increment. Now i=4 and j=3. here arr[i] and arr[j] both are zero . so both the if cases will be false . so i=4 and j=3\n" +
                "sixth iteration:i will increment. Now i=5 and j=3. first condition is true so swapping takes place . now after swapping new array is {33,78,99,90,0,0,889}. now we check second if condition which is also true so j will increment. now i=5 and j=4\n" +
                "sevent iteration:i will increment. Now i=6 and j=4. first condition is true so swapping will take place so new array after swapping is {33,78,99,90,889,0,0}. second condition is also true so j will also increment . so now i=6 and j=5\n" +
                "for loop ends" );
      System.out.println();
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
