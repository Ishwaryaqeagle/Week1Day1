package MyNewPack2;

public class NumberOfDigits {

	public static void main(String[] args) {
		int i=0;
		int number=12345;
		while(number!=0)
		{
			number=number/10;
			i++;
		}
		System.out.println("The number of digits in the given number is " +i);
	}

}
