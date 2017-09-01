import java.util.*;
public class pos
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int d=0;
if(a<=100000)
{
d++;
}
if(d==1&&a<0)
{
System.out.print("Negative");
}
if(d==1&&a>0)
{
System.out.print("Positive");
}
if(d==1&&a==0)
{
System.out.print("zero");
}
if(d==0)
{
System.out.print("Not in range");
}
}
}
