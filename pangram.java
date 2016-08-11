import java.io.*;
import java.util.*;
class pangram
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a=in.nextLine();
int len=a.length();
if(a.length()<0)
{
System.out.println("NOT PANAGRAM");
}
char[] b=a.toCharArray();
Set ab=new HashSet();
for(int i=0;i<len;i++)
ab.add(b[i]);
if(ab.size()==26)
System.out.println("it is panagram");
else
System.out.println("it is not a panagram");
}
}