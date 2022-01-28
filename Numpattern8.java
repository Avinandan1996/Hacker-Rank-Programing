import java.util.Scanner;

public class Numpattern8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
	
     for(int i=1;i<=n;i++)
    {
    	 int count=1;
	for(int j=1;j<=n;j++)
{
		
		
		System.out.print(count*i+" ");
		count++;
		
	
	}
	System.out.println();


	}

	}

}
