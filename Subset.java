import java.util.*;
public class Subset
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        String s=sc.nextLine();
        String t1[]=t.split(",");
        ArrayList<Integer>l=new ArrayList<Integer>();
        for(int j=0;j<t1.length;j++)
        {
            l.add(Integer.parseInt(t1[j]));
        }
        
        String s1[]=s.split(",");
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=0;i<s1.length;i++)
        {
            al.add(Integer.parseInt(s1[i]));
        }
        System.out.print(al.containsAll(l));
        
    }
}
