package sorting;
/*
 * O(nLogn)
 */
public class QuickSort {
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int left, int right) {
		if(left>=right)
			return;
		// pick pivot as the middle element
		int pivot = (right + left)/2;
		// returns index of the partition
		int index = partition(arr, left, right, pivot);
		// recursive to left and right sub arrays
		quickSort(arr, left, index - 1);
		quickSort(arr, index, right);
	}

	private static int partition(int[] arr, int left, int right, int pivot) {		
		while(left<=right) {
			// move pointer until u find an element on the left greater than pivot
			while(left<pivot) {
				left++;
			}
			// move pointer until u find an element on the right less than pivot			
			while(right> pivot) {
				right--;
			}
			// swap if element at left is less than element at right, and move both pointers
			if(left <= right) {
				int temp = left;
				left = right;
				right = temp;
				left++;
				right--;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		int[] arr = {36,54,65,91,11,23,47,76,88};
		quickSort(arr);
		for(int i = 0; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
	}
}
