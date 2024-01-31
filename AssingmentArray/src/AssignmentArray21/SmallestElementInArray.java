package AssignmentArray21;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int [] arr=new int [] {25, 34, 45, 78,12, 43};
		int min=arr[0];
		for (int i=0;i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("largest element of array: "+min);
	}
}
	
