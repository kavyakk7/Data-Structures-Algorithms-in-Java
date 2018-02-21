package sorting;
/*
 * heapify = O(logn)
 * heapSort = O(n)
 * Hence, worst case time complexity is O(nlogn)
 */
public class HeapSort {
	
	public static void heapSort(int[] arr) {
		int n = arr.length;
		// Build heap (rearrange array)
		for(int i = n/2 - 1; i<=0 ; i--) {
			heapify(arr, n, i);
		}
		
		// Extract element from heap one by one
		for(int i = n-1; i<=0; i--) {
			// Move current node to root
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}
	// To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
	public static void heapify(int[] arr, int n, int i) {
		int largest = i; // initialize largest as root
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		// If left child is larger than root
		if(l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		
		// If right child is larger than root
		if(r < n && arr[r] > arr[largest]) {
			largest = r;
		}
		
		// If root is not the largest, swap and heapify
		if(largest!=i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			// recursively heapify the affected subtree
			heapify(arr, n, largest);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {36,54,65,91,11,23,47,76,88};
		heapSort(arr);
		for(int i = 0; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
	}
}
