package Aabstractions;
abstract class Bike1 {
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed: "+spd);
	}
	abstract void color() ;
}
class Honda4 extends Bike1 {
	@Override
	void run() {
		System.out.println("running safely");
	}
	@Override
	void speed(int spd) {
		System.out.println("Honda4 speed: "+spd);
		super.speed(120);
	}
	@Override
	void color() {
		System.out.println("Honda1 color is blue");
	}
}

public class abstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();		
		//Bike1 b1=new Bike1(); //we cann't create an object of abstract class as it is incomplete class
		Bike1 b2=new Honda4();	
		b2.run();
		b2.speed(20);
		b2.color();
		//b2.color();
	}
}
/*
classname ref;

new classname();

*/
	


