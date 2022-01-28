import java.util.*;
public class RigthRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[n];

		int br[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
    
		for(int i= k;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				br[j]=ar[k];
			}
		}
		for(int i= 0;i<k;i++)
		{
			for(int j=k;j<n;j++)
			{
				br[j]=ar[k];
			}
		}
		
		for(int j=0;j<n;j++)	
		{
			System.out.print(br[j]+" ");
		}

	}

}



