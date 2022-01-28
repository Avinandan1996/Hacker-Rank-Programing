import java.util.Scanner;
import java.util.*;
public class AddingLast2digit {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//123
      int n1=0, sum=0,operation=0;
	   while(operation<2)//while(n>0) sum of all digit number will give
	   {
		   n1=n%10;//3 2
		   sum=sum+n1;
		   n=n/10;
		   operation++;
	   }
	   System.out.println(sum);//5
		

	}

}
