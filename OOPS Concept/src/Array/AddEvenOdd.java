package Array;

import java.util.ArrayList;

public class AddEvenOdd {
public static void main(String[] args) {
	int[] a= {8,7,4,4,2,7,9,8,4,9,5};
	ArrayList<Integer> al1= new ArrayList<>();
	ArrayList<Integer> al2= new ArrayList<>();
	for(int i=0;i<a.length;i++)
	if(a[i]%2==0) {
		al1.add(a[i]);
		
	}
	else {
		al2.add(a[i]);
	}
	//System.out.println(al1);
	//System.out.println(al2);
	int toatl=0;
	for(int no:al1) {
		toatl=toatl+no;
	}
	System.out.println("Even no of addittion are"+toatl);
	int total2 =0;
	for(int no2:al2) {
		total2= total2+no2;
	}
	System.out.println("Total noof odd are "+total2);
}
}
