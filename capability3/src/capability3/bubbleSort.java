package capability3;
import java.util.*;

public class bubbleSort {
	
	static void bs(int arr[])
	{
		int i,j,temp;
		for(i=0;i<arr.length;i++)
		{	
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j+1]<=arr[j])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
//			System.out.println("Array after"+(i+1)+"pass");
//			for(int k=0;k<arr.length;k++)
//				System.out.print(arr[k]+" ");
		}
		 for(i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,size;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter array size : ");
		size=scanner.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter the array elements : ");
		for(i=0;i<arr.length;i++)
			arr[i]=scanner.nextInt();
		
		 System.out.println("Sorting using Bubble Sort method : ");
		 bs(arr);
	}

}
