
public class question7 {

	public static void main(String[] args)
	{
		char n='+';
		float a,b;
		a=6;b=6;
		float c = 0;
		switch(n)
		{
			case'+':
			c=a+b;
		    break;
			case'-':
			c=a-b;
			break;
			case'*':
			c=a*b;
			break;
			case'/':
			c=a/b;
			break;	
			default:
			System.out.println("invalid");
		}
	System.out.println("The calculation is="+c);
	}

}
