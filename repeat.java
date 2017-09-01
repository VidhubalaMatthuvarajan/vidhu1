import java.util.*;
public class repeat
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(a[j]==a[k])
                {
                    e++;
                }
            }
                if(e>0)
                {
                    System.out.print(a[j]+" ");
                }
            e=0;
     
    }    }
}
