import java.util.*;
public class ArrayRotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
       // int q=sc.nextInt();
        int ar[]=new int[n];
        int br[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	ar[i]=sc.nextInt();
        	
        }
        
       
       for(int i=0;i<r;i++)
       {
    	   br[i]=ar[n-r+i];
    	   
       }
       for(int i=r;i<n;i++)
       {
    	   br[i]=ar[i-r];
    	   
       }
       for(int i=0;i<n;i++)
       {
    	   ar[i]=br[i];
       }
      for(int i=0;i<n;i++) {
    	System.out.print(ar[i]+" "); 
      }  
//      for(int i=0;i<q;i++)
//      {
//    	  int query=sc.nextInt();
//    	  System.out.println(br[query]);
//      }
       
        
	}

}
