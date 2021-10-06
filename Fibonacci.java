package MyNewPack2;

public class Fibonacci {
	public static void main(String[] args) 
	{
		
		int i=0;
		int j=1;
		int a=0;
		for(i=0;i<9;i=i+j)
		{	
			System.out.println(i);
			a=i;
			i=j;
			j=a;
			
		}
	}
}
