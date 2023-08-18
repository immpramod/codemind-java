import java.util.*;
public class pattern15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                char ch=(char)('A'+n-i);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}