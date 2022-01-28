import java.util.Scanner;
public class frequencyofnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			int x=a[j];
			int count=0;
			if(x==-1)continue;
			for(int i=0;i<n;i++)
			{
				if(x==a[i])
				{
					count++;
					a[i]=-1;
					
				}
			}
			System.out.println("The frequence of "+ x+" is "+ count);

		}
		
	}

}
