package Project_Collection;

import java.util.*;

class box implements Comparable<box>{
    double length;
    double width;
    double height;
    double volume;
    box(){}
    public box(double length, double width, double height, double volume){
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = volume;
    }
    
    public double getLength(){
        return length; 
    }
    
    public double getWidth(){
        return width; 
    }
    
    public double getHeight(){
        return height; 
    }
    
    public double getVolume(){
        double vol = length*width*height;
        return vol;
    }
    
    public String display(){
        String str = String.format("length = " + length + ", width = " + width +", height = " + height + ", Volume = %.2f", volume);
        return str;
    }
    
    @Override
    public int compareTo(box b){
        if(this.volume > b.getVolume())
            return 1;
        else if(this.volume < b.getVolume())
            return -1;
        else
            return 0;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == this)
            return true;
        if(obj == null || obj.getClass()!=this.getClass())
            return false;
        box b = (box) obj;
        return volume == b.getVolume();
    }
    
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = result*prime ;
        return result;
    }
}

public class Project_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        double l,w,h,v;
        System.out.println("Enter the number of Box : ");
        n = sc.nextInt();
        int i;
        Set <box> s = new TreeSet<>();
        
        for(i=1;i<=n;i++){
            System.out.println("Enter the Box "+i+" details : ");
            System.out.println("Enter length : ");
            l = sc.nextDouble();
            System.out.println("Enter width : ");
            w = sc.nextDouble();
            System.out.println("Enter height : ");
            h = sc.nextDouble();
            v = l*w*h;
            box b = new box(l,w,h,v);
            s.add(b);
            
           
        }
        
        System.out.println("Unique Boxes in the Set are : ");
        for(box b2 : s){
            System.out.println(b2.display());
        }
    }
}