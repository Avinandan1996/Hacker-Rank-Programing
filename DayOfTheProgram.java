import java.util.*;
public class DayOfTheProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(y<1918)
		{
			if(y%4==0)
		
		{
			System.out.println("12.09."+y);
		}
		else
		{
			System.out.println("12.09."+y);
		}
		
	}
		if(y>1918)
		{
			if((y%400==0)||((y%4==0)&&(y%100!=0)))
		
		{
			System.out.println("12.09."+y);
		}
		else
		{
			System.out.println("12.09."+y);
		}
		
	}
		if(y==1918)
		{
			System.out.println("26.09."+y);

		}
		
}

}
