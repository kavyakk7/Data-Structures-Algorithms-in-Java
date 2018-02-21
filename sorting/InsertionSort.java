package sorting;
/*
 * worst case O(n^2)
 */
public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n ; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args) {
		int[] arr = {36,54,65,91,11,23};
		insertionSort(arr);
		for(int i = 0; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
	}
}
