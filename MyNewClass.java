package MyNewPack2;

public class MyNewClass {
	int i;
	int j;
	public int variable(int i)
	{
		return i;
	}
	public int assign()
	{
		j=i;
		return j;
	}
public static void main(String[] args) {
	MyNewClass objclass=new MyNewClass();
	objclass.i=10;
	int j=objclass.assign();
	System.out.println(j);
	
}

}
