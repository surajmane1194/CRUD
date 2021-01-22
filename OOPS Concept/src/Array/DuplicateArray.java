package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] a= {3,4,2,3,5,6,4,2,5};
	HashSet<Integer> s= new HashSet<>();
	for(int no:a) {
		if(s.add(no)==false) {
		
			System.out.println(no+" ");
		
		}
	}
	
	}
}
