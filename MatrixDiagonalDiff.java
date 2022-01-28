import java.util.*;
public class MatrixDiagonalDiff {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int ar[][]=new int[n][n];
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                ar[i][j]=sc.nextInt();
	            }
	        }
	        int d1=0,d2=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                if(i+j==n-1)
	                {
	                    d1=d1+ar[i][j];
	                }
	                 if(i==j)
	                {
	                    d2=d2+ar[i][j];
	                }
	            }
	        }
	        System.out.println(Math.abs(d1-d2));
	        

	}

}
