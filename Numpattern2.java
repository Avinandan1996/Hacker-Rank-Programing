import java.util.Scanner;

public class Numpattern2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count=n*(n+1)/2;
     for(int i=1;i<=n;i++)
    {
	for(int j=1;j<=i;j++)
	{
		if(count<10)
		{
			System.out.print(0);
		}
		System.out.print(count +" ");
		count--;
	}
	System.out.println();
  }

	}

}
