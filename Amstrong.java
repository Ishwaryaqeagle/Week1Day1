package MyNewPack2;

public class Amstrong {
	
public static void main(String[] args) {
	int calculated=0;
	int input=153;
	int reminder;
	int original=input;
	int temp=0;
	int sum=0;
	while(input!=0)
	{
		reminder=input%10;
		temp=input/10;
		calculated=reminder*reminder*reminder;
		sum=sum+calculated;
		input=temp;
		//input=result;
		//reminder=number%10;
		//result=reminder*reminder*reminder;
		//sum=sum+result;
		//quotient=number/10;
		//number=quotient;
	}
	if(sum==original)
	{
		System.out.println("It is an amstrong Number");
	}
	else
	{
		System.out.println("It is Not an amstrong Number");
	}
}
}
