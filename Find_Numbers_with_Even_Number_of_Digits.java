import java.util.*;
public class Digits
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
             String s="";
            s=s+arr[i];
            if(s.length()%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}