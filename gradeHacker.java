import java.util.*;
public class gradeHacker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int v1=sc.nextInt();
        int x2=sc.nextInt();
        int v2=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            x1=x1+v1;
        }
        for(int i=0;i<n;i++){
            x2=x2+v2;
        }
        if(x1==x2)
        {
            System.out.println("YES");
        }
        else{
             System.out.println("NO");
        }
        

	}

}
