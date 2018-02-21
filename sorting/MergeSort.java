package sorting;
/*
 * time = O(nLogn)
 * space = O(n)
 */
public class MergeSort {
	
	public static void mergeSort(int[] arr) {
		int n = arr.length;
		
		if(n < 2)
			return;
		
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		// Copy data to temporary arrays ledt[] and right[]
		int i;
		for(i = 0; i<=mid-1 ; i++) {
			left[i] = arr[i];
		}
		for(i = mid; i<=n-1; i++) {
			right[i-mid] = arr[i];
		}
		// Recursive call to divide the arrays left[] and right[] into further arrays
		// and call mergeSort(3 params) to sort them
		mergeSort(left);
		mergeSort(right);
		mergeSort(left, right, arr);
	}
	
	static void mergeSort(int[] left, int[] right, int[] arr) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		
		while(i < nL && j < nR) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of left[] if any */
		while(i < nL) {
			arr[k] = left[i] ;
			i++;
			k++;
		}
		/* Copy remaining elements of right[] if any */
		while(j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {36,54,65,91,11,23,47,76,88};
		mergeSort(arr);
		for(int i = 0; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
	}
}
