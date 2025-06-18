package Array;
import java.util.Scanner;
public class MultiplicationTable { 
	public static void main(String[]args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number ");
		int number =scanner.nextInt();
		int[] Table=new int[10];
		for(int i=1;i<=10;i++) {
			Table[i-1]=number*i;
		}
		for(int i=0;i<10;i++) {
			System.out.println(number + "*" +( i+1) +" ="  +Table[i]);
		}
		
	}

}
