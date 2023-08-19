import java.util.*;
public class pattern
{
    public static int findThirdLargest(int[] arr) 
    {
        Arrays.sort(arr);

        int distinctElements = 1;
        int n = arr.length;

        for (int i = n-1; i >0; i--) {
            if (arr[i] != arr[i - 1]) {
                distinctElements++;
            }

            if (distinctElements == 3) {
                return arr[i-1];
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int thirdLargest = findThirdLargest(arr);
        if(thirdLargest==-1)
        {
            System.out.println(arr[n-1]);
        }
        else
        {
            System.out.println(thirdLargest);
        }
    }
}