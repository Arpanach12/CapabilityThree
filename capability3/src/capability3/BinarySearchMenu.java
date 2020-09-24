package capability3;
import java.util.*;
public class BinarySearchMenu {
	static int i,j,k;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice,numSize,stringSize;
		char ch;
		do {
		System.out.println("Menu:\n"
				+	"1. Binary Search for Integer Elements\n"
				+	"2. Binary Search for Strings\n"
				+	"3. Exit\n");
		
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		
		switch(choice)
		{
		case 1 : System.out.println("Enter the size of the array : ");
				 numSize=scanner.nextInt();
				 int[] arr=new int[numSize];
				 System.out.print("Enter the array elements : ");
				 for(i=0;i<numSize;i++)
					 arr[i]=scanner.nextInt();
				 
				 int[] sortedArr=new int[numSize];
				 sortedArr=sortI(arr);
				 System.out.println("Sorted array is : ");
				 for(i=0;i<sortedArr.length;i++)
					 System.out.print(sortedArr[i]+" ");
				 
				 System.out.print("\nEnter the element to be searched : ");
				 int key=scanner.nextInt();
				 boolean check1=findElement(sortedArr,key);
				 if(check1)
					 System.out.print("Element found");
				 else
					 System.out.print("Element not found");
				 break;
		case 2 :System.out.println("Enter the number of words : ");
				stringSize=scanner.nextInt();
				String[] inputString =new String[stringSize];
				scanner.nextLine();
				 System.out.print("Enter the words : ");
				 for(i=0;i<stringSize;i++)
					 inputString[i]=scanner.nextLine();
				 
				 String[] sortedStr=new String[stringSize];
				 sortedStr=sortString(inputString);
				 System.out.println("Sorted string is : ");
				 for(i=0;i<sortedStr.length;i++)
					 System.out.print(sortedStr[i]+" ");
				 
				 System.out.print("\nEnter the string to be searched : ");
				 String search=scanner.nextLine();
				 boolean check2=findElement(sortedStr,search);
				 if(check2)
					 System.out.print("String found");
				 else
					 System.out.print("String not found");
				 break;
		case 3 :System.out.print("Thank you. Have a Good Day !!!");System.exit(0);
		default:System.out.print("Enter valid number...");
		}	 
		System.out.println("\nDo you want to continue ? Press Y/y for yes or any other key to discontinue : ");
		ch=scanner.next().charAt(0);
		if(!(ch=='Y'||ch=='y'))
			System.out.print("Thank you. Have a Good Day !!!");
		}while(ch=='Y'||ch=='y');
	}
	
	private static boolean findElement(String[] sortedStr, String search) {
		// TODO Auto-generated method stub
		boolean c=false;
		int l=0,h=sortedStr.length-1,m;
		while(l<=h)
		{
			m=(l+h)/2;
			if((sortedStr[m].compareTo(search)<0))
					l=m+1;
			else if(sortedStr[m].compareTo(search)>0)
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

	private static String[] sortString(String[] inputString) {
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

	private static boolean findElement(int[] sortedArr, int key) {
		// TODO Auto-generated method stub
		int low=0,high=sortedArr.length-1,mid;
		boolean b=false;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==sortedArr[mid])
				 {
					b= true ;
					break;
				 }
			else if(key<sortedArr[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		if(low>high)
			b=false;
		
		return b;
	}

	private static int[] sortI(int[] arr) {
		// TODO Auto-generated method stub
		 int temp;
		 for(i=1;i<arr.length;i++)
		 {
			 temp=arr[i];
			 
			 for(j=i-1;j>=0 && temp<arr[j];j--)
				 arr[j+1]=arr[j];
			 
			arr[j+1]=temp;	 
		 }
		return arr;
	}

}
