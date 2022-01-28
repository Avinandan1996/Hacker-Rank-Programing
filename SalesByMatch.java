import java.util.*;

public class SalesByMatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		int br[]=new int[100];
		int pair=0;
		for(int j=0;j<100;j++)
		{
			br[j]=0;
		}
		int element=0;
		for(int i=0;i<n;i++)
		{
			element=sc.nextInt();
			br[element-1]++;
		}
		for(int j=0;j<100;j++)
		{
			 pair+=br[j]/2;
		}
		System.out.println(pair);
	}

}
