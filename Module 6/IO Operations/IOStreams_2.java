package IOStreams;

import java.io.*;
import java.util.*;

public class IOStreams_2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String in = sc.nextLine();
		System.out.println("Enter the output file name");
		String out = sc.nextLine();
	
		File filein = new File(in);
		File fileout = new File(out);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		
		br.close();
		bw.close();
		
	}
}