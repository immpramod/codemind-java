import java.util.*;
public class Aditya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%3==0 && n%5==0 )
            System.out.println("PlingPlang");
        else if(n%3==0)
        System.out.print("Pling");
        else if(n%5==0)
        System.out.print("Plang");
        else if(n%7==0)
        System.out.print("Plong");
        else 
        System.out.print(n);
    }
}