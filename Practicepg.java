import java.util.*;
import java.util.TreeSet;
public class Practicepg
{
    

	public static void main(String [] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int q=sc.nextInt();
    	String s=sc.next();
    	
    	int i=0;
    	while(i<q){
    		int left=sc.nextInt();
        	int rigth=sc.nextInt();
    		String g=s.substring(left,rigth+1);
    		System.out.println(g);
    		int k=0;
    	int c=1;
    	
    	while(c<=g.length()) {
    		
    		int start=0,end=c;
    		
    		while(end<=g.length()) {
    		g.substring(start,end);
    		
    			start++;
    			end++;
    				k++;
    		}
    		
    		c++;
    	}
    	System.out.println(k);
    	i++;
    	}
    }

	
	}
