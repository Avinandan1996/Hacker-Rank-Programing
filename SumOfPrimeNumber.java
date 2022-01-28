import java.util.*;
public class SumOfPrimeNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
    int n=sc.nextInt();
    int j=1,sum=0,c=0;
     while(c<=n)
     {
    	 j++;
     
    	boolean b=isprime(j);
    	if(b==true) {
    		sum=sum+j;
    		c++;
    	}
    	if(c==n)
    	{
    		break;  
    	}
    	
     }
     
    	System.out.println(sum);
     
	}
	

	private static boolean isprime(int j) {
		int c=0;
		for(int i=2;i<=j/2;i++)
		{
			if(j%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}  
}
	 


