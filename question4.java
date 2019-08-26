public class question4
{
public static void main(String [] args)
{
int a=10,b=6,c=27,d=87;
int larger=0;
larger=a>b?a:b;
larger=c>larger?c:larger;
larger=d>larger?d:larger;
System.out.println(larger);
}
}
