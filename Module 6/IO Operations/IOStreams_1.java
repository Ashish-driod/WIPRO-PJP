package IOStreams;


import java.io.*;
import java.util.Scanner;

public class IOStreams_1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String name = sc.nextLine();
		System.out.println("Enter the character to be counted");
		char s = sc.nextLine().charAt(0);
	
		File file = new File("C:\\Users\\Ashish\\Desktop\\Input.txt");
		int Count = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		int ch;
		do {
			ch = br.read();
			
			if (ch >= 65 && ch <= 90) {   //Making upercases to lowercases.
				ch+=32;
			}
			if (s>= 65 && s<= 90) {
				s += 32;
			}
			
			if (ch == s) {
				Count++;
			}
		} while (s != -1);
				
		System.out.println("File '" + name + "' has " +
				Count + " instances of letter '" + s + "'.");
		
			}

}