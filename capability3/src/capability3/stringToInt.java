package capability3;
import java.util.*;
public class stringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		
		int i,k=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str = scanner.nextLine();
		int c=0;
		for(i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='0') && (str.charAt(i)<='9'))
			{
			   k++;
			}		
		}
		if(k==str.length())
		{
			System.out.println("Valid String : ");
		
				while(k>0)
				{
				c=10*c+(int)str.charAt(str.length()-k)-48;
				k--;
				}
				System.out.print(c);
		}
		else
			System.out.print("Invalid String");
	}

}
