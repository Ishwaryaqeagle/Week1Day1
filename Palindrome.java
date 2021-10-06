package MyNewPack2;

public class Palindrome {

	public static void main(String[] args) {
		String A ="madam";
		String rev="";
		char ch[]=A.toCharArray();
		for(int i=A.length()-1;i>=0;i--) 
		{
			rev=rev+ch[i];
			
		}
		if(rev.equals(A))
		{
			System.out.println("The given text is palindrome");
		}
		else
		{
			System.out.println("The given text is not a palindrome");
		}
	}

}
