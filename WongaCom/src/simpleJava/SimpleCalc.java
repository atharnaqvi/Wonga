package simpleJava;

public class SimpleCalc {

	public static void main(String[] args) {
		int three;
		int five;
		for(int i=1; i<=100; i++) {
			three = i%3;
			five = i%5;
			if(three == 0) {
				System.out.println("fizz = " + i);
			}
			else if(five == 0) {
				System.out.println("Fiver = " + i);
			}
			else {
				System.out.println("not matched = "  +i);
				
			}
		}

	}

}
