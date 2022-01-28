import java.lang.reflect.Array;
import java.util.*;
public class Codepractise {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        
        
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
      // int a1=0,b1=0,c1=0,d1=0;
        
            int a1=ar[0]+ar[1]+ar[2]+ar[3];
            int b1=ar[1]+ar[2]+ar[3]+ar[4];
            int c1=ar[2]+ar[3]+ar[4]+ar[0];
            int d1=ar[3]+ar[4]+ar[0]+ar[1];
            
        int br[]={a1,b1,c1,d1};
       Arrays.sort( br);
       
        System.out.println(br[0]+" "+br[3]);
	                
	    

	}

}
