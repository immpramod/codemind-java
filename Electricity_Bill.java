import java.util.*;
public class Bill
{
    public static float total(int units)
    {
        float amt;
        if(units<=199)
            amt=units*1.20f;
        else if(units>200 && units<400)
            amt=units*1.50f;
        else if(units>400 && units<600)
            amt= units*1.80f;
        else
        amt= units*2.00f;
        if(amt>400)
        amt=amt*0.15f+amt;
        else
        amt=amt+100;
        return amt;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String cut_id,name;
        int units;
        float electricity;
        cut_id=sc.nextLine();
        name=sc.nextLine();
        units=sc.nextInt();
        electricity=Bill.total(units);
        System.out.format("%.2f",electricity);
    }
}