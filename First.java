import java.util.*;
public class First
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(",");
        int t[]=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            t[i]=Integer.parseInt(s1[i]);
        }
        if(t.length>=2)
    {
        for(int k=0;k<t.length;k++)
        {
            for(int q=k+1;q<t.length;q++)
            {
                if(t[k]==t[q])
                {
                    System.out.print(t[q]);
                    System.exit(0);
                }
            }
        }
    }
    else
    {
        System.out.print("Not in range");
    }
    }
}
