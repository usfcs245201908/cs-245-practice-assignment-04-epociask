public class BubbleSort implements SortingAlgorithm{


	public BubbleSort(){

	}


	public void sort(int[] a){

		for(int i = 0; i < a.length- 1; i++){

			for(int j = 0; j < a.length- 1; j++){

				if(a[j] > a[j+1]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;

				}

			}
		}
	}
}