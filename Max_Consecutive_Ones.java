import java.util.*;
public class MoveZeroes{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                c++;
                if(c>max)
                {
                    max=c;
                }
            }
            else
            {
                c=0;
            }
        }
        System.out.println(max);
    }
}