import java.util.*;
public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int [n];
		int e=100; 
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		int c=(i+k)%n;
		while(c!=0)
		{
			if(((i+k)%n)==0)
			{
				e--;
			}
			else if(((i+k)%n)==1)
			{
				e=e-1-2;
			}
			
		}
				
		}
		System.out.println(e);
}

}
