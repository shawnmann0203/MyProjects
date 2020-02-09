
public class Loops {

	public static void main(String[] args) {
		
		
		//*****LOOP 1*****//
		
		int theCounter = 0;
		while(theCounter <= 100) {
			System.out.println(theCounter);
			theCounter++;
		}
		
		System.out.println();
		
		//*****LOOP 2*****//
		
		theCounter = 100;
		
		while(theCounter >= 0) {
			System.out.println(theCounter);
			theCounter -= 3;
		}
		
		System.out.println("");
		
		//*****LOOP 3*****//
		
				
		for (int i = 1; i <= 100; i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//*****LOOP 4*****//
		
		for(int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("HelloWorld");
			} else if (i % 3 == 0){
				System.out.println("Hello");
			} else if (i % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(i);
			}
			
		}

	}

}
