package MyNewPack2;

public class Characteroccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char[ ] charr=str.toCharArray();
		for(int i=1;i<charr.length;i++)
	{
		if(charr[i]=='e')
		
			count=count+1;
		}
		System.out.println(count);
	}
	}
	
