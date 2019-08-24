
public class question6a {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=1900;
		if ((n%4==0) || ((n%100==0) && (n%400==0)))
		{
			System.out.println("Yes a leap year");
		}
		else 
		{
			System.out.println("Not a leap year");
	    }

}
}
