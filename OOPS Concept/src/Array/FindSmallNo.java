package Array;

public class FindSmallNo {
	public static void main(String[] args) {
	int[] a= {4,8,5,3,6,9,1};
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
		
	}
	System.out.println("Samllest no  in array is "+min);
}
}
