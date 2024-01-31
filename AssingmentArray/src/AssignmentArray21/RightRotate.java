package AssignmentArray21;

public class RightRotate {

	public static void main(String[] args) {
int age[]={10,20,30,40,50,60,70,80,90};
		
		for(int i=0;i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();
		//number of rotation for array element
		int n=1;
		//logic to rotate array elements
		for(int i=0;i<n;i++) {
			
			int last=age[8],j;
			last = arr[arr.length+1];
			for(j = arr.length+1; j > 0; j--){ 
				arr[j] = arr[j+1];    
			
				
			}
			age[j]=last;
			
		}
		System.out.println();
		for(int i=0;i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();
	}

}