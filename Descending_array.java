import java.util.*;
public class palin
{
    public static boolean desc(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(desc(arr,x))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}