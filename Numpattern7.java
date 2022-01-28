import java.util.Scanner;

public class Numpattern7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
	
     for(int i=1;i<=n;i++)
    {
    	 int count=0;
	for(int j=1;j<=n;j++)
{
		
		
		System.out.print(i+count*5+" ");
		count++;
		
	
	}
	System.out.println();


	}

	}

}
