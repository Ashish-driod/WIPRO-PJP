package Project_Collection;

import java.util.*;

class card{
	
	card(){
		
	}
	
	char s;
	int n;
	card(char s , int n){
		this.s = s;
		this.n = n;
	}
	
	char getSymbol() {
		return s;
	}
	
	int getNumber() {
		return n;
	}
}


public class Project_4{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Cards.");
		int n = sc.nextInt();
		Map<Character,ArrayList<card>> tm = new TreeMap<>();  //SortedHashMap
		for(int i = 0; i<n;i++) {
			System.out.println("Enter card "+(i+1));
			char s  = sc.next().charAt(0);
			int a = sc.nextInt();
			if(tm.containsKey(s)) {
				ArrayList<card> al = tm.get(s);
				al.add(new card(s,a));
				tm.put(s,al);
			}else {
				ArrayList<card> al = new ArrayList<>();
				al.add(new card(s,a));
				tm.put(s,al);
			}
		}
		System.out.println("Distinct Symbols are :");
		Set<Map.Entry<Character,ArrayList<card>>> entries = tm.entrySet();
		for(Map.Entry<Character,ArrayList<card>> e : entries) {
			System.out.print(e.getKey()+" ");
		}
		System.out.println("\n");
		
		for(Map.Entry<Character,ArrayList<card>> f : entries) {
			int sum = 0;
			System.out.println("Cards in "+f.getKey()+" symbol.");
			ArrayList<card> al = f.getValue();
			for(card c : al) {
				if(c.getSymbol() == f.getKey()) {
					System.out.println(c.getSymbol()+" "+c.getNumber());
					sum+=c.getNumber();
				}
			}
			System.out.println("Number of Cards : "+al.size());
			System.out.println("Sum of Numbers : "+sum);
			System.out.println("\n");
		}
	}
	
}