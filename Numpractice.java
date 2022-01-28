import java.util.Scanner;

public class Numpractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int k=1;k<=n-1;k++)
	{
		for(int j=1;j<=2*(n-k+1)-3;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
