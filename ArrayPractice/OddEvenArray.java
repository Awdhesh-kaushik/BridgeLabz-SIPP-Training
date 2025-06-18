package Array;
import java.util.Scanner;
public class OddEvenArray {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter a natural number");
		int number =scanner.nextInt();
		if (number <=0) {
			System.out.println("error : number is not natural");
		}
		  int size = number / 2 + 1;
	        int[] OddNumbers = new int[size];
	        int[] EvenNumbers = new int[size];
	        int OddIndex = 0;
	        int EvenIndex = 0;
	        for(int i =1;i<=number;i++) {
	        	if(i%2==0) {
	        		EvenNumbers [EvenIndex ++]=i;
	        	}else {
	        		OddNumbers [OddIndex ++]=i;
	        	}
	        }
	        System.out.print("Odd numbers Array: ");
	        for (int i = 0; i < OddIndex; i++) {
	            System.out.print(OddNumbers[i] + " ");
	        }
	        System.out.print("Even Number Array: ");
	        for(int i = 0; i < EvenIndex; i++) {
	        	System.out.print(EvenNumbers[i] + " ");
	        }
	        scanner.close();
	

	}

}
