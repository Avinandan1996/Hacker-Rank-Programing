import java.util.*;
public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cum=0;
		int k=5;
		for(int i=0;i<n;i++)
		{   
			
			int recp=k/2;
			int temp=recp*3;
			    k=temp;
		
			    cum=cum+recp;
		}	
	   System.out.println(cum);
	}

}
