import java.util.Scanner;

public class LocalMinima {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the Array Element");
		for(int i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a[0]<a[1])
		{
			System.out.println("The Local minima is "+ a[0]+" which is present at the "+ 0 +" index\n");
		}
		if(a[n-1]<a[n-2])
		{
			System.out.println("The Local minima is "+a[n-1]+" which is present at the "+ (n-1)+" index\n");
		}
		for(int i=1;i<=n-2;i++)
		{
			if(a[i] < a[i-1] && a[i] < a[i+1])
			{
				System.out.println("The peak is "+a[i]+" which is present at the "+ i+" index\n");
			}
		}

	}

}
