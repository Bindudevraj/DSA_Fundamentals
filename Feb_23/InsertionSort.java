//Given a sorted array of distinct integers and a target value, 
//	return the index if the target is found. If not, 
//	return the index where it would be if it were inserted in order.
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4

package Feb_23;

public class InsertionSort {

	static int find_index(int[] arr, int n, int target)
	{
	    for(int i = 0; i < n; i++) {
	        if (arr[i] == target) {
	            return i;
	        }else if (arr[i] > target) {
	            return i;
	        }
	    }
	    return n;
	}
	 
	public static void main(String[] args)
	{
	    int[] arr = {1, 3, 5, 6};
	    int n = arr.length;
	    int target = 5;
	     
	    System.out.println(find_index(arr, n, target));
	}

}
