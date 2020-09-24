package capability3;
import java.util.*;
public class MergeMultipleSortedArray {
	
	static int i,j,k=0;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of lists to be merged : ");
		int m = scanner.nextInt();
		System.out.println("Enter the number of elements in each list : ");
		int n = scanner.nextInt();
		
		int total=m*n;
		int[] totalarr=new int[total];
		
		
		for(i=0;i<m;i++)
		{
			System.out.println("Enter the elements in "+(i+1)+" list : ");
			for(j=0;j<n;j++)
			{
				totalarr[k]=scanner.nextInt();
				k=k+1;
			}
	    }
		
		totalarr=sort(totalarr);
		System.out.println("After merging "+m+" sorted lists");
		for(k=0;k<total;k++)
			System.out.print(totalarr[k]+" ");
}

	private static int[] sort(int[] totalarr) {
		// TODO Auto-generated method stub
		int temp;
		for(i=0;i<totalarr.length;i++)
			for(j=0;j<totalarr.length-i-1;j++)
				if(totalarr[j]>=totalarr[j+1])
				{
					temp=totalarr[j];
					totalarr[j]=totalarr[j+1];
					totalarr[j+1]=temp;
				}
		return totalarr;
	}
}