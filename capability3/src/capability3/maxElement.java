package capability3;
import java.util.*;
public class maxElement {

	static int i,j,k=0,initial_index,final_index;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size  of the array :");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements  of the array :");
		for(i=0;i<n;i++)
			arr[i]=scanner.nextInt();
		int[] arr2= new int[n];
		System.out.print("Enter the starting index : ");
		initial_index = scanner.nextInt();
		System.out.print("Enter the final index : ");
		final_index = scanner.nextInt();
		
		System.out.println("New Array :");
		for(i=initial_index;i<=final_index;i++)
			{
			arr2[k]=arr[i];
			System.out.print(arr2[k]+" ");
			k=k+1;
			}
		
		arr2=sort(arr2);
		
		System.out.println("\nThe maximum number between indices "+initial_index+" & "+final_index+" is "+arr2[arr2.length-1]);
		
	}
	private static int[] sort(int[] arr2) {
		// TODO Auto-generated method stub
		int temp;
		for(i=1;i<arr2.length;i++)
		{
			temp=arr2[i];
			for(j=i-1;j>=0 && temp<arr2[j] ; j--)
				arr2[j+1] = arr2[j];
			
			arr2[j+1]= temp;
		}
		return arr2;
	}

}
