import java.util.*;
public class Find
{
    public static void main(String []args)
    {
        int d=0,j=0,e=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(",");
        int b[]=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            b[i]=Integer.parseInt(s1[i]);
        }
      int  min=b[0];
        for(j=0;j<b.length;j++)
        {
            if(min<=b[j])
            {
                d++;
                min=b[j];
            }
        }
        if(d!=b.length)
        {
            System.out.print("Not in range");
            e=2;
        }
          for(j=0;j<b.length;j++)
        {
            if(d==b.length&&b[j]==j)
            {
                System.out.println(b[j]);
                e=1;
            }
        }
        if(e==0)
        {
            System.out.print("Number not found");
        }
        
    }
}
