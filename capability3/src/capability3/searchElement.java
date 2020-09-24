package capability3;
import java.util.*;
public class searchElement {
	static int i,j,count=0,pos,k=0;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size  of the array :");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements  of the array :");
		for(i=0;i<n;i++)
			arr[i]=scanner.nextInt();
		
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
				k=k+1;
		}
		
		if(k==arr.length-1)
		{
		System.out.println("Enter the element to be searched : ");
		int  search = scanner.nextInt();
		for(i=0;i<n;i++)
		{
			if(search==arr[i])
				System.out.print("\nElement found at "+i+" index");
		}
		}
		else
		{
			System.out.print("Duplicate element exists...");
			System.exit(0);
		}
		
//		for(i=0;i<n;i++)
//		{
//			if(search==arr[i])
//			{	pos=i;
//				count++;
//				if(count>1)
//				{
//					System.out.print("Duplicate element exists...");
//					System.exit(0);
//				}
//			}
//		}
//		if(count==1)
//			System.out.print("Element found at "+pos+" index.");
	}

}
