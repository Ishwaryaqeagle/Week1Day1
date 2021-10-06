package MyNewPack2;

public class ChangeOddIndex {
	public static void main(String[] args) {
	String test="changeme";
	int count=0;
	char[ ] charr=test.toCharArray();
	for(int i=0;i<charr.length;i++)
	{
		count=i%2;
		if(count==0)
		{	
			System.out.println(charr[i]);
		}
		else
		{
			char upperCase = Character.toUpperCase(charr[i]);
			System.out.println(upperCase);
		}
	
	}}
}
