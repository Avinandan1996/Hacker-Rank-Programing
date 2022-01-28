import java.util.*;
public class BeautifulDaysattheMovies {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int k=sc.nextInt();
		int count=0; 
		for(int i=x;i<=y;i++)
		{
			if((i-reverse(i))%k==0)
			
				count++;
			
		}
		System.out.println(count);
		
		
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int digi=num%10;
			rev=rev*10+digi;
			num=num/10;
		}
		
		return rev;
	}


}
