import java.util.Scanner;
public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int f[] = new int[5];
        
        for(int i=0;i<5;i++)
            f[i] = 0;
            
        int element = 0;
        for(int i=0 ; i<n ; i++)
        {
            element = sc.nextInt();
            f[element - 1]++;
        }
        
        int highestFreq = 0 ; int highestFreqElement=0;
        for(int i = 0 ; i < 5 ; i++)
        {
            if( highestFreq < f[i])
            {
                highestFreq = f[i];
                highestFreqElement = i + 1;
            }
        }
        
        System.out.println(highestFreqElement);


	}

}
