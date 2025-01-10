package Arrays;

public class Palindrome
{
    public static boolean pali(String str)
    {

        int i=0;
        int j=str.length()-1;
        while (i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Palindrome check");
        String a="Sushmita";
        String b="Gadag";
        System.out.println(" a is "+pali(a.toUpperCase()));
        System.out.println(" b is "+pali(b.toUpperCase()));

    }
}
