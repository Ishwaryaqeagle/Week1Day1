package MyNewPack2;

public class Primenumber {  
	public static void main(String[] args) {

	    int num = 1;
	    boolean prime = false;
	    for (int i = 2; i <= num / 2; i++) 
	    {
	    	//System.out.println(i);
	      if (num % i == 0) {
	        prime = true;
	        break;
	      }
	    }
	    if (prime==false)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}
		 

