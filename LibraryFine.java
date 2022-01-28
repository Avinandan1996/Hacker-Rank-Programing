import java.util.*;
public class LibraryFine {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the return dates");
     int dd1=sc.nextInt();
     int mm1=sc.nextInt();
     int yy1=sc.nextInt();
     System.out.println("Enter the due dates");
     int dd2=sc.nextInt();
     int mm2=sc.nextInt();
     int yy2=sc.nextInt();
     int fine=0;
     if(dd1==dd2 && mm1==mm2 && yy1==yy2)
     {
    	  fine=0;
     }
     else if(dd1>dd2 && mm1==mm2 && yy1==yy2)
     {
    	  fine=15*(dd1-dd2);
     }
     else if(dd1!=dd2 && mm1>mm2 && yy1==yy2)
     {
    	  fine=500*(mm1-mm2);
     }
     else if (dd1!=dd2 && mm1!=mm2 && yy1>yy2)
     {
    	  fine=10000;
     }
     else if (dd1==dd2 && mm1==mm2 && yy1>yy2)
     {
    	  fine=10000;
     }
     System.out.println(fine);
     
	}

}
