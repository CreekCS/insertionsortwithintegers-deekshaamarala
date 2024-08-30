//Deeksha Amarala

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsSortInt {
    public static void main(String args[]) throws Exception {
      File file = new File("randInts.txt");
      Scanner sc = new Scanner(file);
      ArrayList<Integer> randInts = new ArrayList<Integer>();
      while (sc.hasNextInt()) {
        randInts.add(sc.nextInt());
        }   
    insertionSort(randInts);
    }
public static void insertionSort(ArrayList<Integer> list){
    for(int i = 1; i < list.size(); i++){
        int j = i - 1;
        int key = list.get(i);
        while(j>=0 && list.get(j) > key){
            list.set(j+1, list.get(j));
            j--;
            list.set(j + 1, key);
    }
}
  System.out.println("The smallest number is " + list.get(0));
  System.out.println("The largest number is " + list.get(list.size()-1));
}  
} 
