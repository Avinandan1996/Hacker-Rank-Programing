import java.util.*;
public class ElectronicsShop {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int b=sc.nextInt();
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int ar[]=new int[n];
	        int br[]=new int[m];
	        
	        int sum=0;
	        for(int i=0;i<n;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        for(int i=0;i<m;i++)
	        {
	            br[i]=sc.nextInt();
	        }
	        int k=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                 sum=ar[i]+br[j];
	               
	                 if(sum<b && sum>k)
	                 {
	     	        	  k=sum; 
	     	        }

	            }
	        }
	        
	         
	        if(k>b)
	        {
	             System.out.println("-1"); 
	        }
	        else {
	        	System.out.println(k);
	        }
	        

	}

}
