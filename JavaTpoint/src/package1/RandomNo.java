package package1;

public class RandomNo {

	public static void main(String[] args) {
		System.out.println("1st Random Number: " + Math.random());   
		System.out.println("2nd Random Number: " + Math.random());  
		System.out.println("3rd Random Number: " + Math.random());   
		System.out.println("4th Random Number: " + Math.random()); 
		System.out.println();
		int min = 200;  
		int max = 400;  
		//Generate random double value from 200 to 400   
		System.out.println("Random value of type double between "+min+" to "+max+ ":");  
		double a = Math.random()*(max-min+1)+min;   
		System.out.println(a);  
		//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);  
	}

}
