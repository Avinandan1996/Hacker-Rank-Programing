import java.util.Scanner;
import java.util.*;

public class CountingOfVowel {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the sentence");
			String str=sc.nextLine();
			str=str.toUpperCase();
			char y[]=str.toCharArray();
			int size=y.length;
			int vowel = 0;
			int cons=0;
			int spec=0;
			int i=0;
			while(i!=size)
			{
			if(y[i]>='A' && y[i]<='Z')
			{
				if(y[i]=='A'|| y[i]=='E' || y[i]=='I'||y[i]=='O'|| y[i]=='U')
				{
					++vowel;
				}
				else
				{
					++ cons;
				}
			}
				else
				{
					++spec;
				}
			++i;
			}
			System.out.println("Vowel "+vowel);
			System.out.println("consonant "+cons);
			System.out.println("special char "+spec);
			
				
			}  
		
			 




	}


