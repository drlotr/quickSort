
public class QuickSorter {
	public static void quickSort(int[] list, int l, int r) {
		if(l < r) {
			int pivotIndex = partition(list, l, r);
			quickSort(list, l, pivotIndex-1);
			quickSort(list, pivotIndex+1, r);
		}
	}
	public static int partition(int[] list, int l, int r) {
		int p = list[0];
		int temp = 0;
		int i = 1, j = r;
		for(i = 1; i < r; i++) {
			if(p > list[i]) {
				i++;
			}
			if(p < list[j]) {
				j--;
			}
			if(i <= j) {
				exchangeNumbers(list, i, j);
			}
		}
	       temp = list[0];
	       list[0] = list[j];
	       list[j] = temp;
		return j;
	}
    private static void exchangeNumbers(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
