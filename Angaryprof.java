import java.util.*;
public class Angaryprof
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            ar[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<=n-1;i++)
        {
            if(ar[i]<=0)
            {
                c++;
            }
        }
        if(k==c)
        {
            System.out.println("YES");
        }
        else
        {
             System.out.println("NO");
        }
        
    }
}
