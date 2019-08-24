
public class question5 {

	public static void main(String[] args) {
		
		
	    double n=12345.00;
		double tax;
		
		if(0.00<=n && n<=14999.99)
		{
			tax=0.00+((n-0.00)*(15/100.00));
			System.out.println("The total tax ="+tax);
			
		}
		else if(15000.00<=n && n<=29999.99)
		{
			tax=2250.00+((n-15000.00)*(18/100.00));
			System.out.println("The total tax ="+tax);
			
		}
		else if(30000.00<=n && n<=49999.99)
	    {
		    tax=5400.00+((n-30000.00)*(22/100.00));
			System.out.println("Total tax ="+tax);
		
		}
		else if(50000.00<=n && n<=79999.99)
		{
			tax=11000.00+((n-50000.00)*(27/100.00));
			System.out.println("Total tax ="+tax);
			
		} 
		else if(80000.00<=n && n<=150000.00)
		{
			tax=21600.00+((n-80000.00)*(33/100.00));
		    System.out.println("Total tax ="+tax);
		}
		else
		{
			System.out.println(-1.0);
		}
		
		

	}

}
