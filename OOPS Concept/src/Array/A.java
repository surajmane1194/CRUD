package Array;

public class A {
	public static void main(String[] args) {
		
	
	int[] a= {1,2,3,5,6};
	int no_element=a.length;
	int expected_elemt=a.length+1;
	int total_sum=expected_elemt*(expected_elemt+1)/2;
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum = sum+a[i];
	}
	System.out.println("MIsssing no is an "+(total_sum-sum));
	}
}
