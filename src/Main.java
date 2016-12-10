
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stratege stratege = new Stratege();
		BubbleSort bubblesort = new BubbleSort();
		SelectionSort selectionsort = new SelectionSort();
		QuickSort  quicksort = new QuickSort();
		
		
		stratege.doSort(bubblesort);
				
	}

}
