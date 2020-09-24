package capability3;

import java.util.Scanner;

public class binarySearchDig {

	static boolean BinarySearch(int arr[],int key)
	{
		int mid,low,high;
		low = 0;
		high = arr.length-1;
		mid=(low+high)/2;
		boolean test=false;
	//	boolean flag=true;
		while(low<=high)
		{
			
			if(arr[mid]<key)
				low=mid+1;	
			else if(key<arr[mid])
				high=mid-1;
			else
			{
				test=true; break;
		//		flag=false;
			}
			mid=(low+high)/2;
		}
		if(low>high)
			test=false;
		
		return test;
	}
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
		 boolean check = BinarySearch(arr,key);
		 if(check)
			 System.out.println("Element found");
		 else
			 System.out.println("Element not found");
	}

}
