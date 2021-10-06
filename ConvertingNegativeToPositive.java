package MyNewPack2;

public class ConvertingNegativeToPositive {

	
	public static void main(String[] args) {
		int i=-40;
		int j;
		if(i<0)
		{
			j=~(i-1);
			System.out.println(j);
					
		}
		else
		{
			System.out.println("Number is positive");
		}
	}

}
