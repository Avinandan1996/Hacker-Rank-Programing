import java.util.*;
public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int q=sc.nextInt();
//		for(int j=0;j<q;j++)
//		{
		int n=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		
		int ar[]=new int[m];
	   for(int i=0;i<m;i++)
	   {
		   ar[i]=s;
		   if(ar[i]==n)
		   {
			 s=0;  
		   }
		   s++;
		  
	   }

	   System.out.print(ar[m-1]);
	//}
	}

}
