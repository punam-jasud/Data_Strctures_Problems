package Tree;

public class BinarySearchOnArrayInJava {

	private static int binarySerach(int[] arr, int first, int last, int key) {
		
		if(last >= first){
			int mid = first + (last - first)/2;
			if(arr[mid] == key)
			{
				return mid;
			}
			if(arr[mid] > key){
				return binarySerach(arr, first,mid-1, key); //Search in left subarray
			}else{
				return binarySerach(arr, mid+1,last, key); //Search in right subarray
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int key = 30 ;
		
		int last = arr.length - 1;
		int result = binarySerach(arr,0,last,key);
		
		if(result == -1)
			System.out.println("Elemet is not found");
		else
			System.out.println("Elemet is found at index " + result);	
	}

}
