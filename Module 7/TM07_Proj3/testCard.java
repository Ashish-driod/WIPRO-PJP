package Project_Collection;

import java.util.*;

class card implements Comparable<card>{
    public char symbol;
    public int number;
    card(){}
    card(char symbol,int number){
        this.symbol = symbol;
        this.number = number;
    }
    
    public void setSymbol(char symbol){
        this.symbol = symbol;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public char getSymbol(){
        return symbol;
    }
    
    public int getNumber(){
        return number;
    }
    
    @Override
    public int compareTo(card obj) {
        if(this.symbol>obj.symbol)
            return 1;
        else 
            return -1;
    }
}

public class testCard {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char s;
        int n;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        Set<card> st = new HashSet<>();
        while(c1==0 || c2==0 || c3==0 || c4==0){
            card obj = new card();
            System.out.println("Enter a card : ");
            s = sc.nextLine().charAt(0);
            n = sc.nextInt();
            obj.setSymbol(s);
            obj.setNumber(n);
            sc.nextLine();
            if(s=='a')
                c1++;
            else if(s=='b')
                c2++;
            else if(s=='c')
                c3++;
            else
                c4++;
            
            if(c1==1 && s=='a')
                st.add(obj);
            else if(c2==1 && s=='b')
                st.add(obj);
            else if(c3==1 && s=='c')
                st.add(obj);
            else if(c4==1 && s=='d')
                st.add(obj);
        }
        System.out.println("Four symbol gathered in "+(c1+c2+c3+c4)+" cards.");
        System.out.println("Cards in Set are : ");
        Iterator<card> it = st.iterator();
        while(it.hasNext()){
            card obj = it.next();
            System.out.println(obj.getSymbol()+ " "+obj.getNumber());
        }
    }
}