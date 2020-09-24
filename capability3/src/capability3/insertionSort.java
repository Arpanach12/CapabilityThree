package capability3;
import java.util.*;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] arr = new int[] {89,45,34,23,11};
		int[] arr2;
		arr2=insertion_sort(arr);
		for(i=0;i<arr.length;i++)
			System.out.print(arr2[i]+ " ");
	}

	private static int[] insertion_sort(int[] arr) {
		// TODO Auto-generated method stub
		
		int j,k,temp;
		for(j=1;j<arr.length;j++)
		{
			temp=arr[j];
			for(k=j-1;k>=0 && temp<arr[k] ; k--)
				{ 
				arr[k+1]=arr[k];
				}
			
			arr[k+1]=temp;
		}
		
		
		return arr;
	}

}
