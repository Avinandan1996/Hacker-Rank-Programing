import java.util.*;
public class CutTheSticks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		int br[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int k=0;
		Arrays.sort(ar);
		for(int i=0;i<n;i++)
		{
			
			br[i]=ar[i]-ar[0];
		}
		for(int i=0;i<n;i++) {
		System.out.print(br[i]+" ");
		}

	}

}
