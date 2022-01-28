import java.util.*;
public class BillDivision {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(i!=b)
			{
				sum=sum+ar[i];
			}
		}
		int p=sum/2;
		if(k>p)
		{
			System.out.println(k-p);
		}
		else if(k==p) {
			System.out.println("Bon Appetit");
		}

	}

}
