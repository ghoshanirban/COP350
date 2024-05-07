package tester;

import stacksandqueues.ArrayStack;

public class TestArrayStack {



	public static void main(String[] args) {
		ArrayStack<String> cityNames = new ArrayStack<>(5);

		cityNames.push("Jacksonville");
		cityNames.push("Atlanta");
		cityNames.push("Orlando");
		cityNames.push("Miami");
		cityNames.push("Gainesville");

		for( var city : cityNames )
			System.out.print(city + " ");

		System.out.println("\nTop element: " + cityNames.top());

		while( !cityNames.isEmpty() ) {
			String s = cityNames.pop();
			System.out.println(s);
		}
		
		System.out.println(cityNames.size());
		System.out.println(cityNames.isEmpty());


		int[] sourceArray = {50,60,70,80,90,100};
		int[] destinationArray = new int[sourceArray.length];

		for(int index = 0; index < sourceArray.length; index++)
			destinationArray[index] = sourceArray[index];

	}
}
