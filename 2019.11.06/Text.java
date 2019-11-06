import java.util.Arrays;
public class Text {
	public static void bubbleSort(int[] a){
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++){
			for (int j = 0; j < a.length - i - 1; j++ ){
				if (a[j] > a[j + 1]){
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static int binarySearch(int[] a, int n){
		int left = 0;
		int right = a.length - 1;
		while(left <= right){
			int mid = (left + right) / 2;
			if(n > a[mid]){
				left = mid + 1;
			} else if(n < a[mid]){
				right = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] a = {0, 1, 2, 3, 4, 5, 6};
		bubbleSort (a);
		System.out.println(Arrays.toString(a));
		int ret = binarySearch(a, 0);
		System.out.println("下标是" + ret);
	}
}