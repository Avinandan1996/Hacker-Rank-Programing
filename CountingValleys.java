import java.lang.reflect.Array;
import java.util.*;
public class CountingValleys {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char ar[]=s.toCharArray();
		int a=0;
		int c=0;
		
		for(int i=0;i<n;i++)
		{
			if(ar[i]=='U')
			{
				if(a==-1)
				{
					c++;
				}
				a++;
			}
			if(ar[i]=='D')
			{
				a--;
			}
		}
		System.out.println(c);
		

	}

}
