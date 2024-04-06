package homeassignment.week1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int[] arr = {1, 4, 3, 2, 8, 6, 7}; // Given array
		
		// arr = { 1,2,3,4,6,7,8}
		
        Arrays.sort(arr); // Sort the array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) { // Check if the current element is not equal to its position in the sorted array
            	//arr[0] 1 == 1
            	//arr[1] 2 == 2
            	//arr[2] 3 == 3
            	//arr[3] 4 == 4
            	//arr[4] 6 <> 5
            	
            	
                System.out.println("Missing number is: " + i+1);
                break;
	}

}
	}
}
