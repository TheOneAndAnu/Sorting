public class NewSort {
	   
	public static void main(String[] args) {
		      
		int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		System.out.print("Unsorted Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
      
        int len = arr.length;
        
        for (int i = 0; i < len-1; i++)
        {
            int min = i;
            for (int j = i+1; j < len; j++)
                if (arr[j] < arr[min])
                    min = j;
 
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    
	
   
      System.out.print("\nUnsorted Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
   }
}
