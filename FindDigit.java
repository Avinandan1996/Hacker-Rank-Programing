import java.util.*;
public class FindDigit {

public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int  c=0;
   int t=sc.nextInt();
   for(int i=0;i<t;i++)
   {
   int n=sc.nextInt();
   int k=n;
 
      while(n!=0)
      {
    	  int digi=n%10;
    	  
    	if( digi!=0 && k%digi==0 )
    	{
    		c++;
    	}
    	n=n/10;
    	 
      }
      System.out.println(c);
 
	}
}
}
