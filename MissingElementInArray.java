package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,7,6,9};
	
		Arrays.sort(arr);
		for(int i=arr[0];i<=arr.length;i++)
		{
			
				
				if(arr[i-1]!=i) {
					System.out.println(i);
					break;
			}
			}
		
		}

	

}
