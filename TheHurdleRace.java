import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
       int d=ar[n-1]-k;
        if(d>1)
        {
            System.out.println(d);
        }
        else
        {
            System.out.println(0);
        }
	}

}
