package June2023Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumbersApp {

	public static void main(String[] args) {
		
		 // Part i: Create an ArrayList of integers and remove odd numbers

		ArrayList<Integer> OddEve = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("remove the odd numbers ");
		System.out.println("Enter numbers(Enter 0 to stop)");
		
		int inputNumber;
		
		while( (inputNumber = sc.nextInt() ) !=0) {
			OddEve.add(inputNumber);
		}
		
		OddEve.removeIf(Odn->Odn % 2 ==0);
		
		System.out.println("The ODD Numbers are : ");
		for(int Odn : OddEve) {
			System.out.println(Odn);
		}
	}
	
}