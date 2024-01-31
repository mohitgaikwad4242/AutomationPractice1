package AssignmentArray21;

public class CopyArrayElement1toanother {

	public static void main(String[] args) {
			
			char[] orgArray = { 'a', 'b','e', 'c', 'd'}; //Initialize array
			char[] dupArray=new char[orgArray.length];
			
			for(int i=0;i<dupArray.length;i++)
			{
				dupArray[i]=orgArray[i];
			}
			
			for(char c:dupArray) {
				System.out.println(c);
			}	

	}

}
