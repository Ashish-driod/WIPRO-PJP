package WrapperClasses;

import java.util.Scanner;

public class Wrapper_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');
		System.out.println(output);
		
		
	

	}

}