package capability3;
import java.util.*;

public class StringSortingMenu {
	
	static int i,j,k;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,stringSize;
		char ch;
		
		System.out.println("Enter the number of words : ");
		stringSize=scanner.nextInt();
		String[] inputString =new String[stringSize];
		scanner.nextLine();
		 System.out.print("Enter the words : ");
		 for(i=0;i<stringSize;i++)
			 inputString[i]=scanner.nextLine();
		 String[] strSorted =  new String[stringSize];
		 do {
		System.out.println("Menu:\n"
				+	"1. Sort using Bubble sort\n"
				+	"2. Sort using Insertion sort\n"
				+	"3. Search a string\n"
				+	"4. Exit\n");
		
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		
		

		String search;
		switch(choice)
		{
			case 1:System.out.print("Bubble Sort :\n");
					strSorted=B_Sort(inputString);
					for(i=0;i<strSorted.length;i++)
						System.out.print(strSorted[i]+" ");
					break;
			case 2:System.out.print("Insertion Sort :\n");
					strSorted=I_Sort(inputString);
					for(i=0;i<strSorted.length;i++)
						System.out.print(strSorted[i]+" ");
					break;		
			case 3:System.out.print("Enter the string to be searched : ");
					scanner.nextLine();
					search=scanner.nextLine();
					boolean check=findElement(strSorted,search);
					 if(check)
						 System.out.print("String found");
					 else
						 System.out.print("String not found");
					 break;
			case 4 :System.out.print("Thank you. Have a Good Day !!!");System.exit(0);
			default:System.out.print("Enter valid number...");
		}
		System.out.println("\nDo you want to continue ? Press Y/y for yes or any other key to discontinue : ");
		ch=scanner.next().charAt(0);
		if(!(ch=='Y'||ch=='y'))
			System.out.print("Thank you. Have a Good Day !!!");
		}while(ch=='Y'||ch=='y');
	}

	private static boolean findElement(String[] strSorted, String search) {
		// TODO Auto-generated method stub
		boolean c=false;
		int l=0,h=strSorted.length-1,m;
		while(l<=h)
		{
			m=(l+h)/2;
			if((strSorted[m].compareTo(search)<0))
					l=m+1;
			else if(strSorted[m].compareTo(search)>0)
				h=m-1;
			else
				{ c=true;
				break;
				}
				
		}
		if(l>h)
			c=false;
		
		return c;
	}

	private static String[] I_Sort(String[] inputString) {
		// TODO Auto-generated method stub
		String temp;
		for(i=1;i<inputString.length;i++)
		{
			temp=inputString[i];
			for(j=i-1;j>=0 && (temp.compareTo(inputString[j])<0);j--)
				inputString[j+1]=inputString[j];
			inputString[j+1]=temp;
		}
		return inputString;
	}

	private static String[] B_Sort(String[] inputString) {
		// TODO Auto-generated method stub
		String temp;
		for(i=0;i<inputString.length;i++)
		{
			for(j=0;j<inputString.length-i-1;j++)
			{
				if(inputString[j].compareTo(inputString[j+1])>0)
				{
					temp=inputString[j+1];
					inputString[j+1]=inputString[j];
					inputString[j]=temp;
				}
			}
		}
		
		return inputString;
	}

}
