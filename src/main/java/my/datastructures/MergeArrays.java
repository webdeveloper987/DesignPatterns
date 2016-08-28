package my.datastructures;

public class MergeArrays {
	public static void merge(int[] a, int[] b, int n, int m) {
	    int k = m + n - 1; // Index of last location of array b
	    int i = n - 1; // Index of last element in array b
	    int j = m - 1; // Index of last element in array a

	    // Start comparing from the last element and merge a and b
	    while (i >= 0 && j >= 0)   {
	        if (a[i] > b[j]) {
	            a[k--] = a[i--];
	        }else {
	            a[k--] = b[j--];
	        }
	    }
	    while (j >= 0) {
	        a[k--] = b[j--];
	    } 
	}
	
	public static void main(String[] args){
		int[] b = new int [15];
		b[0] = 2;
		b[1] = 3;
		b[2] = 7;
		b[3] = 8;
		b[4] = 9;

		int[] a = new int[15];
		a[0] = 1;
		a[1] = 4;
		a[2] = 5;
		a[3] = 6;
		a[4] = 10;
		
		merge(a, b, 5, 5);
		for(int i : a){
			System.out.print(i);
			System.out.print(", ");
		}
		System.out.println();
		for(int i : b){
			System.out.print(i);
			System.out.print(", ");
		}
	}
}
