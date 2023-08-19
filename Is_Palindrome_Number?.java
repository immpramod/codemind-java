import java.util.*;
public class palin
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
            System.out.print(2);
        }
        else
        {
            System.out.println(1);
        }
    }
}