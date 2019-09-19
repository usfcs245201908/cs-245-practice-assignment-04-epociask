public class InsertionSort implements SortingAlgorithm{


	public InsertionSort(){}



	public void sort(int[]a){

		int temp;

		//Outer  for loop to start from one to end of array
		for(int i = 1; i < a.length; i++){

			temp = a[i];  

			for(int l = i-1; l>=0; l--){

				if(temp < a[l]){
					a[l+1] = a[l];
					a[l] = temp;
				}
				
				
			}
		}
			}


}



