package sorting;

/*
 * worst case O(n^2)
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1 ; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {36,54,65,91,11,23};
		bubbleSort(arr);
		for(int i = 0; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
	}
}