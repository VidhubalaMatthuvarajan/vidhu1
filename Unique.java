import java.util.*;
public class Unique
{
    public static void main(String []args)
    {
        int f=1,e=0,t=0,q=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(",");
        int a[]=new int[s1.length];
        if(s1.length>=2&&s1.length<=1000)
        {
        for(int k=0;k<s1.length;k++)
        {
            a[k]=Integer.parseInt(s1[k]);
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i!=j&&a[i]==a[j])
                {
                    f++;
                }
                else
                {
                    e++;
                }
            }
                if(f!=2)
                {
                System.out.println(a[i]);
                t=1;
                }
                f=1;
            }
        }
        else
        {
            System.out.print("Not in range");
            q=1;
        }
        if(e%2==s1.length%2&&t==0&&q==0)
        {
            System.out.print("No number is unique");
        }
    }
}
