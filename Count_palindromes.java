import java.util.*;
public class palin
{
    public static boolean palind(int n)
    {
        int s=n;
        int rev=0;
        while(s!=0)
        {
            int r=s%10;
            rev=rev*10+r;
            s=s/10;
        }
        if(rev==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        int c=0;
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
            if(palind(arr[i]))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}