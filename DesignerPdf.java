import java.util.*;

public class DesignerPdf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int ar[]=new int[26];
       
        for(int i=0;i<26;i++)
        {
        	ar[i]=sc.nextInt();
        }
        String s=sc.next();
        int max=0; int p=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
        	p=s.charAt(i)-97;
        	if(ar[p]>max)
        	{
        		max=ar[p];
        	}
        }
        System.out.println(max*l);
         
        
	}


}
