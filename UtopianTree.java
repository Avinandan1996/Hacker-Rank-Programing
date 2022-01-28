import java.util.*;
public class UtopianTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int t=sc.nextInt();
		int h=1;
		for(int k=1;k<=t;k++)
		{
			if(k%2!=0)
			{
				h=h*2;
			}
			else {
				h=h+1;
			}
			
		}
		System.out.println(h);
		
	}
	}

}
