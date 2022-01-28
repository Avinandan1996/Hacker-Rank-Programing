import java.util.*;
public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of an array");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println("Enter the rotation no. of an array");
	    int d=sc.nextInt();
	    for(int j=0;j<d;j++)
	    {
	    	int temp=arr[0];
	    	for(int i=1;i<n;i++)
	    	{
	    		arr[i-1]=arr[i];
	    	}
	    	arr[n-1]=temp;
	    }
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    

	}

}
