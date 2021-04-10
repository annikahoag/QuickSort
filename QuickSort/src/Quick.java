
public class Quick {

	//instance variables
	private int arr[] = new int[10];
	private int sortedArr[] = new int[10];
	private int index=0, size=0;
	
	//constructor
	public Quick() {
		
	}
	
	
	//add numbers to arr
	public void addArray(int n) {
		if (size<10) {
			arr[index] = n;
			index++;
			size++;
		}else {
			System.out.println();
			System.out.println("Sorry, there are too many integers in the array.");
			System.out.println();
		}
			
		System.out.println("Here is what your array looks like right now.");
		for (int i=0; i<size; i++) {
			System.out.println(i + ": " + arr[i]);
		}
			System.out.println();
	}
	
	
	/*copy arr data so that it can be sorted in a different array, 
	call sort method*/
	public void sortCall() {
		
		for (int i=0; i<size; i++) {
			sortedArr[i] = arr[i];
		}
		
		this.sort(sortedArr, 0, size-1);
	}
	
	
	//sort method
	private void sort(int sArr[], int low, int high) {
		
		if (low<high) {
			/*pi is at partitioning index, arr[pi] is 
			 now at right place*/
			int pi = partition(sortedArr, low, high);
				
			//recursively sort elements before partition and after partition
			sort(sortedArr, low, pi-1);
			sort(sortedArr, pi+1, high);
		}	
	}
		
	
	
	//partition method 
	private int partition(int sArr[], int low, int high) {
		
		//pivot=first element in array
		int pivot = sortedArr[low];
		
		//index of higher element 
		int i = high+1;
		
		//loop from end of array to beginning
		for (int j=high; j>low; j--) {
			
			//if current element is <= pivot 
			if (sortedArr[j] <= pivot) {
				i--;
				
				//swap arr[i] and arr[j]
				int temp = sortedArr[i];
				sortedArr[i]= sortedArr[j];
				sortedArr[j]=temp;
			}
		}
		
		//swap arr[i+1] and arr[high] or pivot 
		int temp = sortedArr[i-1];
		sortedArr[i-1] = sortedArr[low];
		sortedArr[low] = temp;
		
		return i-1;
		
	}
	
	//print method
	public void print() {
		
		//print unsorted 
		System.out.println("Unsorted: ");
		for (int i=0; i<size; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.println();
		
		
		//print sorted 
		System.out.println("Sorted: ");
		for (int i=0; i<size; i++) {
			System.out.print(" " + sortedArr[i]);
		}
		System.out.println();
		System.out.println();
		
	}
	

	
}
