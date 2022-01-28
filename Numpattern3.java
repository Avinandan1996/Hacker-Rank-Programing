import java.util.Scanner;

public class Numpattern3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
	
     for(int i=0;i<n;i++)
    {
	for(int j=0;j<n;j++)
	{
//		if(i%2==0)
//		{
//			System.out.print("0");
//		}
//		else {
//			System.out.print("1");
//		}
		System.out.print((i+j)%2);
		

	}
	System.out.println();
  }

	}

}
