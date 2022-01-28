import java.util.*;
public class MargingTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of an array1");
       int n1=sc.nextInt();
       System.out.println("Enter the length of an array2");
       int n2=sc.nextInt();
       int ar1[] = new int [n1];
       int ar2[] = new int [n1];
       for(int i=0;i<=n1-1;i++)
       {
    	  ar1[i]=sc.nextInt(); 
       }
       for(int i=0;i<=n2-1;i++)
       {
    	  ar2[i]=sc.nextInt(); 
       }
       int ar3[]= new int[n1+n2];
       int j=0;
       for(int i=0;i<=n1-1;i++)
       {
    	   ar3[j]=ar1[i];
    	   j++;
       }
       for(int i=0;i<=n2-1;i++)
       {
    	   ar3[j]=ar2[i];
    	   j++;
    	   
       }
       System.out.print(Arrays.toString(ar3));
       
	}

}
