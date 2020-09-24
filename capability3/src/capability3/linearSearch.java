package capability3;

import java.util.*;
public class linearSearch {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size,key;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter array size : ");
		size=scanner.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter the array elements : ");
		for(i=0;i<arr.length;i++)
			arr[i]=scanner.nextInt();
		 System.out.println("Enter the element to be searched : ");
		 key = scanner.nextInt();
		 scanner.close();
		 boolean check = LS(arr,key);
		 if(check)
			 System.out.println("Element found");
		 else
			 System.out.println("Element not found");
	}
	static boolean LS(int arr[],int key)
	{
		int i;
		boolean test=false;
		for(i=0;i<arr.length;i++)
		{
			if(key==arr[i])
				test=true;
			else
				test=false;
		}
		
		return test;
	}


}
