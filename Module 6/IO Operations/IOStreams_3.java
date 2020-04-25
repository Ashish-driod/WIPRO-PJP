package IOStreams;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class IOStreams_3 {
	public static void main(String [] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name.");
		String in = sc.next();
		System.out.println("Enter the file name into which the count will be copied.");
		String out = sc.next();
		
		File file1 = new File("C:\\Users\\Ashish\\Desktop\\Input.txt");
		File file2 = new File("C:\\Users\\Ashish\\Desktop\\Output.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file1));
		BufferedWriter wr = new BufferedWriter(new FileWriter(file2));
		
		HashMap<String , Integer> hm = new HashMap<>();
		
		String s;
		while((s = br.readLine()) != null) {
			String [] str = s.split(" ");
			 
			for(String i : str) {
				if(!hm.containsKey(i)) {
					hm.put(i,1);
				}else {
					int ov = hm.get(i);
					int nv=ov+1;
					hm.put(i,nv);
				}
			}
		}
		
		Set<Map.Entry<String, Integer>> entries = hm.entrySet();
		for(Map.Entry<String, Integer> entry : entries ) {
			wr.write(entry.getKey()+ " : " +entry.getValue() +"\n");
		}
		
		br.close();
		wr.close();
	}
}
