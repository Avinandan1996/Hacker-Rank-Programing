import java.util.*;
public class Decode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int start=0,end=1;
		int c=0;
		while(end<n)
		{
		  s.substring(start,end);
			start++;
			end++;
			int d=Integer.parseInt( s.substring(start,end));
			if(d>0 && d<=26)
			{
				c++;
			}
			
			
		}
		System.out.println(c);

	}

}
