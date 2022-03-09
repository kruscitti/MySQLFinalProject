import java.util.Random;

public class TestDemo {

// ADD POSITIVE NUMBERS METHOD
	
	public int addPositive(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("The parameters must be positive!");
	} else {
		return a + b;
		
	}
		
}
	  
// SQUARE RANDOM NUMBERS METHOD
	
	public int randomNumberSquared() {
		int a = getRandomInt();
		return a*a; 
	}	
	
	
	int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;

	}
}	
	
	
