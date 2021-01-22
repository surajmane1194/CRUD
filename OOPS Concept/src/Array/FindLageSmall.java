package Array;

public class FindLageSmall {
	
	public static void main(String[] args) {
		int[] a= {5,7,8,5,3,4,7,9,2};
		int max= a[0];
		for(int i=1;i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum no is "+max);
	}
}
