
import java.util.*;
public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();
		
		int ar[]=new int [n];
		for(int i=0;i<=n-1;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		int res[]=ar.clone();
		Arrays.sort(res);
		int good=0,bad=0;
		for(int i=0;i<=n-1;i++)
		{
			if (ar[i]==res[i])
             {
	             good=good+ar[i]; 
             }
			else
			{
				bad=bad+ar[i];
			}
		}
		int magic=Math.abs(good-bad);
		System.out.println(magic);
	}

}
