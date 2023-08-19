import java.util.*;
public class Missing
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
             int n=sc.nextInt();
             int s=(n*(n+1))/2;
             //System.out.println(s);
             int arr[]=new int[n-1];
             for(int j=0;j<n-1;j++){
                 arr[j]=sc.nextInt();
             }
             int d=0;
              for(int j=0;j<n-1;j++){
                     d=d+arr[j];
             }
             System.out.println(s-d);
        }
    }
}