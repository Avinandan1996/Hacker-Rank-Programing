import java.util.*;
public class CatsAndMouse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		int d1=Math.abs(z-x);
		int d2=Math.abs(z-y);
		if(d1>d2)
		{
			System.out.println("Cat B");
		}
		else if(d2>d1)
		{
			System.out.println("Cat A");	
		}
		else if(d1==d2)
		{
			System.out.println("Mouse C");
		}
	}
  }

}
