package AssignmentArray21;

public class LargestNumInArray {

	public static void main(String[] args) {
		//Initialize array
		int [] arr=new int [] {25, 34, 45, 78,12, 43};
		//Initialize max with first element of array.
		int max=arr[0];
		//Loop through the array 
		for (int i=0;i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("largest element of array: "+max);
	}
}