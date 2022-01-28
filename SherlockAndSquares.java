import java.util.*;
public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
    for(int i=0;i<t;i++) 
	{
         int a=sc.nextInt();
         int b=sc.nextInt();
         int A=(int)Math.sqrt(a);
         int B=(int)Math.sqrt(b);
         int res=B-A;
         if(A*A >=a)
         res++;
        System.out.println(res);
	}
	}

}
