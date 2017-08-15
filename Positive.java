import java.util.*;
public class Positive
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=Integer.parseInt(s);
if(n>0&&n<=99)
{
  System.out.print(n);
}
  if(n>99)
  {
System.out.print(s.charAt(s.length()-2)+s.charAt(s.length()-1));
}
else
{
System.out.print("0");
}
}
}
