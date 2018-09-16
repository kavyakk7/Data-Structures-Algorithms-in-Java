package sorting;

/*
 * worst case O(n^2)
 */
public class BubbleSort {

	public static void bubbleSort(int[] array) {
		boolean isSorted = false;
		int temp, lastUnsorted = array.length - 1;
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < lastUnsorted; i++) {
				if(array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					isSorted = false;
				}
			}	
			lastUnsorted--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {36,54,65,91,11,23,1};
		bubbleSort(arr);
		for(int i = 0; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
	}
}
