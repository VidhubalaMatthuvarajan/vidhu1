import java.util.*;
class digit
{
    public static void main(String a[])
    {
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        String d=sc.next();
        int b=Integer.parseInt(d);
        System.out.println("enter the delecting digit=");
        int c=sc.nextInt();
        int e[]=new int[d.length()];
        for(i=0;i<d.length();i++)
        {
            e[i]=b%10;
            b=b/10;
			 
        }
        Arrays.sort(e);
        for(j=0;j<d.length()-c;j++)
        {
            System.out.print(e[j]);
        }
        
       
        
    }
}
