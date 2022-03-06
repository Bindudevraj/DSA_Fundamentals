//Given a sorted array of non-negative distinct integers, 
// find the smallest missing non-negative element in it.
//Input:  nums[] = [0, 1, 2, 6, 9, 11, 15]
//Output: The smallest missing element is 3
// 
//Input:  nums[] = [1, 2, 3, 4, 6, 9, 11, 15]
//Output: The smallest missing element is 0
// 
//Input:  nums[] = [0, 1, 2, 3, 4, 5, 6]
//Output: The smallest missing element is 7

package Feb_23;

public class SmallestMissing {

	public static int findSmallestMissing(int[] nums, int left, int right)
    {
        // base condition
        if (left > right) {
            return left;
        }
 
        int mid = left + (right - left) / 2;
 
        if (nums[mid] == mid) {
            return findSmallestMissing(nums, mid + 1, right);
        }
        else {
            // mismatch lies on the left half
            return findSmallestMissing(nums, left, mid - 1);
        }
    }
 
    public static void main(String[] args)
    {
        int[] nums = {0, 1, 2, 3, 4, 5, 6};
 
        int left = 0, right = nums.length - 1;
        System.out.println("The smallest missing element is "
                            + findSmallestMissing(nums, left, right));
    }

}
