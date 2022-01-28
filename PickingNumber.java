import java.util.*; 
public class PickingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
	 Arrays.sort(ar);
		int count=0;
		int max=0;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(ar[i]-ar[j])<=1)
				{
					count++;
				}
			}
			//System.out.println(count);
			if(count>max)
			{
				max=count;	
			}
			count=0;
		}
		System.out.println(max+1);
		

	}

}
