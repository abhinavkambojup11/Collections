//1) Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
// find the sum of the numbers in List.

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
    List <Float> ArrayList= new ArrayList<Float>(5);
    Scanner input = new Scanner(System.in);
    for(int i=0; i<5; i++){
        ArrayList.add(input.nextFloat());
    }
    float sum =0;
    Iterator<Float> itr = ArrayList.iterator();
    while(itr.hasNext()){
        sum+=itr.next();
    }
    System.out.println(sum);
    }
}