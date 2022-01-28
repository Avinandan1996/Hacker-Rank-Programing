import java.util.*;
public class SequenceSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   ar[i]=sc.nextInt();
       }
       int temp=0;
       for(int x=1;x<=n;x++)
       {
    	   for(int i=0;i<n;i++)
    	   {
    		   if(x==ar[i])
    		   {
    			 temp=i+1;
    			 
    		   }
    		   
    	   }
    	   for(int i=0;i<n;i++)
    	   {
    		   if(temp==ar[i])
    		   {
    			   System.out.println(i+1);
    		   }
    	   }
    	  
    	   
       }
	}

}
