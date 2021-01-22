package Array;

public class Second_largest {
	public static void main(String[] args) {
		int[] a= {6,8,4,9,3,8,2,1,3	};
		int largest= Integer.MIN_VALUE;
		int second_largest= Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>largest) {
				second_largest=largest;
				largest=a[i];
			}
			else if(a[i]>second_largest && a[i]!=largest) {
				second_largest=a[i];
			}
		}
		System.out.println("Second largest number in array is "+second_largest);
	}
}
