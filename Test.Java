
public class Test
{

	public static void main(String[] args)
	{
		
		Doctor d = new Doctor("Mike", "Anthony ", "Richards ");
		Bill b = new Bill(1213,1600,2000,600);
		Patient p = new Patient ("Smith ", 1234, 32, 1979, 2011, 2012);
		
		// printing the results
		
		System.out.println(d);
		System.out.println(b);
		System.out.println(p);
	
	}

}
