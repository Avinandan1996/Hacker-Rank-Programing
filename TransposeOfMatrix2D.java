import java.util.*;
public class TransposeOfMatrix2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//initializing the column
		
		int a[][]=new int[n][n];//initializing the array
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();//taking inpit frim user
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=a[j][i];//Transpose of array
			}
		}
		for(int i=0;i<b.length;i++)//printing output
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
