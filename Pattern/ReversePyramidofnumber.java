package Pattern;

public class ReversePyramidofnumber {

	public static void main(String[] args) {
		int r=6;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<i;j++) {	
				System.out.print(" ");
			}
			for(int j=i;j<=r;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
